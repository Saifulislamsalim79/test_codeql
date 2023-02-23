package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes2.dex */
final class C3000g implements DynamiteModule.InterfaceC2991a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2991a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC2991a.C2993b mo31479a(Context context, String str, DynamiteModule.InterfaceC2991a.InterfaceC2992a interfaceC2992a) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC2991a.C2993b c2993b = new DynamiteModule.InterfaceC2991a.C2993b();
        int mo31477b = interfaceC2992a.mo31477b(context, str);
        c2993b.f8174a = mo31477b;
        if (mo31477b != 0) {
            c2993b.f8176c = -1;
        } else {
            int mo31478a = interfaceC2992a.mo31478a(context, str, true);
            c2993b.f8175b = mo31478a;
            if (mo31478a != 0) {
                c2993b.f8176c = 1;
            }
        }
        return c2993b;
    }
}
