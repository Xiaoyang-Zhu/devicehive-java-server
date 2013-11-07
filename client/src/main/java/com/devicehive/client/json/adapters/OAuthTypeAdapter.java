package com.devicehive.client.json.adapters;

import com.devicehive.client.model.OAuthType;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class OAuthTypeAdapter extends TypeAdapter<OAuthType> {
    @Override
    public void write(JsonWriter out, OAuthType value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            out.value(value.getValue());
        }
    }

    @Override
    public OAuthType read(JsonReader in) throws IOException {
        JsonToken jsonToken = in.peek();
        if (jsonToken == JsonToken.NULL) {
            in.nextNull();
            return null;
        } else {
            try {
                return OAuthType.forName(in.nextString());
            } catch (RuntimeException e) {
                throw new IOException("Wrong oauth grant type", e);
            }
        }
    }
}