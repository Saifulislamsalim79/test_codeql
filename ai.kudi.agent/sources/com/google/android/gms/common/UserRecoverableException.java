package com.google.android.gms.common;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: c */
    private final Intent f7682c;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f7682c = intent;
    }
}
