package com.google.android.datatransport.cct.p096f;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;
/* compiled from: LogResponse.java */
/* renamed from: com.google.android.datatransport.cct.f.n */
/* loaded from: classes2.dex */
public abstract class AbstractC2622n {
    /* renamed from: a */
    static AbstractC2622n m32489a(long j) {
        return new C2610h(j);
    }

    /* renamed from: b */
    public static AbstractC2622n m32488b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m32489a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m32489a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo32487c();
}
