package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C2942j;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes2.dex */
public class C2926v {

    /* renamed from: a */
    private final Resources f8088a;

    /* renamed from: b */
    private final String f8089b;

    public C2926v(Context context) {
        s.j(context);
        Resources resources = context.getResources();
        this.f8088a = resources;
        this.f8089b = resources.getResourcePackageName(C2942j.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m31618a(String str) {
        int identifier = this.f8088a.getIdentifier(str, "string", this.f8089b);
        if (identifier == 0) {
            return null;
        }
        return this.f8088a.getString(identifier);
    }
}
