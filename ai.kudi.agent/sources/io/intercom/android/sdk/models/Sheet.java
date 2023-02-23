package io.intercom.android.sdk.models;

import io.intercom.com.google.gson.C10929l;
/* loaded from: classes3.dex */
public class Sheet {
    private final String body;

    /* loaded from: classes3.dex */
    public static final class Builder {
        C10929l sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    Sheet(Builder builder) {
        C10929l c10929l = builder.sheet_request_body;
        this.body = c10929l == null ? "" : c10929l.toString();
    }

    public String getBody() {
        return this.body;
    }
}
