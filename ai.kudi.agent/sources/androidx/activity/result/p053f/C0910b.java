package androidx.activity.result.p053f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.p053f.AbstractC0908a;
import androidx.core.content.C1335a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: ActivityResultContracts.java */
/* renamed from: androidx.activity.result.f.b */
/* loaded from: classes2.dex */
public final class C0910b extends AbstractC0908a<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m37840e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // androidx.activity.result.p053f.AbstractC0908a
    /* renamed from: d */
    public Intent mo35877a(Context context, String[] strArr) {
        return m37840e(strArr);
    }

    @Override // androidx.activity.result.p053f.AbstractC0908a
    /* renamed from: f */
    public AbstractC0908a.C0909a<Map<String, Boolean>> mo37842b(Context context, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            C7521a c7521a = new C7521a();
            boolean z = true;
            for (String str : strArr) {
                boolean z2 = C1335a.m36327a(context, str) == 0;
                c7521a.put(str, Boolean.valueOf(z2));
                if (!z2) {
                    z = false;
                }
            }
            if (z) {
                return new AbstractC0908a.C0909a<>(c7521a);
            }
            return null;
        }
        return new AbstractC0908a.C0909a<>(Collections.emptyMap());
    }

    @Override // androidx.activity.result.p053f.AbstractC0908a
    /* renamed from: g */
    public Map<String, Boolean> mo35876c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
