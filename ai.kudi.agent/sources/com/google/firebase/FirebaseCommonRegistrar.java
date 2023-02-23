package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p169n.C6553d;
import com.google.firebase.p181q.C6726d;
import com.google.firebase.p181q.C6728f;
import com.google.firebase.p181q.C6730h;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ String m25478b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ String m25477c(Context context) {
        return (Build.VERSION.SDK_INT < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (Build.VERSION.SDK_INT < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (Build.VERSION.SDK_INT < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    /* renamed from: e */
    private static String m25475e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6726d.m20944b());
        arrayList.add(C6553d.m21649b());
        arrayList.add(C6730h.m20935a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C6730h.m20935a("fire-core", "20.0.0"));
        arrayList.add(C6730h.m20935a("device-name", m25475e(Build.PRODUCT)));
        arrayList.add(C6730h.m20935a("device-model", m25475e(Build.DEVICE)));
        arrayList.add(C6730h.m20935a("device-brand", m25475e(Build.BRAND)));
        arrayList.add(C6730h.m20934b("android-target-sdk", C5280c.f13093a));
        arrayList.add(C6730h.m20934b("android-min-sdk", C5959e.f14605a));
        arrayList.add(C6730h.m20934b("android-platform", C5606d.f13818a));
        arrayList.add(C6730h.m20934b("android-installer", C5279b.f13092a));
        String m20939a = C6728f.m20939a();
        if (m20939a != null) {
            arrayList.add(C6730h.m20935a("kotlin", m20939a));
        }
        return arrayList;
    }
}
