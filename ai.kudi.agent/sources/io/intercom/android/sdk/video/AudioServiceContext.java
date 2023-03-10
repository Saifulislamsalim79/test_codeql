package io.intercom.android.sdk.video;

import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes3.dex */
public class AudioServiceContext extends ContextWrapper {
    AudioServiceContext(Context context) {
        super(context);
    }

    public static ContextWrapper preventLeakOf(Context context) {
        return new AudioServiceContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("audio".equals(str)) {
            return getApplicationContext().getSystemService(str);
        }
        return super.getSystemService(str);
    }
}
