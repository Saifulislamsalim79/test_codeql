package io.intercom.okhttp3;

import io.intercom.okhttp3.internal.Util;
import java.nio.charset.Charset;
import p425j.p429b.p433b.C11152f;
/* loaded from: classes3.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        String mo11462a = C11152f.m11540m(str + ":" + str2, charset).mo11462a();
        return "Basic " + mo11462a;
    }
}
