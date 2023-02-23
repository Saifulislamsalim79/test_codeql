package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: SavedStateHandle.java */
/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes2.dex */
public final class C1545b0 {

    /* renamed from: e */
    private static final Class[] f4742e;

    /* renamed from: a */
    final Map<String, Object> f4743a;

    /* renamed from: b */
    final Map<String, SavedStateRegistry.InterfaceC1866b> f4744b;

    /* renamed from: c */
    private final Map<String, Object<?>> f4745c;

    /* renamed from: d */
    private final SavedStateRegistry.InterfaceC1866b f4746d;

    /* compiled from: SavedStateHandle.java */
    /* renamed from: androidx.lifecycle.b0$a */
    /* loaded from: classes2.dex */
    class C1546a implements SavedStateRegistry.InterfaceC1866b {
        C1546a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1866b
        public Bundle saveState() {
            for (Map.Entry entry : new HashMap(C1545b0.this.f4744b).entrySet()) {
                C1545b0.this.m35549c((String) entry.getKey(), ((SavedStateRegistry.InterfaceC1866b) entry.getValue()).saveState());
            }
            Set<String> keySet = C1545b0.this.f4743a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(C1545b0.this.f4743a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        clsArr[27] = Build.VERSION.SDK_INT >= 21 ? Size.class : Integer.TYPE;
        clsArr[28] = Build.VERSION.SDK_INT >= 21 ? SizeF.class : Integer.TYPE;
        f4742e = clsArr;
    }

    public C1545b0(Map<String, Object> map) {
        this.f4744b = new HashMap();
        this.f4745c = new HashMap();
        this.f4746d = new C1546a();
        this.f4743a = new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1545b0 m35551a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C1545b0();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C1545b0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new C1545b0(hashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    /* renamed from: d */
    private static void m35548d(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f4742e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public SavedStateRegistry.InterfaceC1866b m35550b() {
        return this.f4746d;
    }

    /* renamed from: c */
    public <T> void m35549c(String str, T t) {
        m35548d(t);
        C1583u c1583u = (C1583u) this.f4745c.get(str);
        if (c1583u != null) {
            c1583u.setValue(t);
        } else {
            this.f4743a.put(str, t);
        }
    }

    public C1545b0() {
        this.f4744b = new HashMap();
        this.f4745c = new HashMap();
        this.f4746d = new C1546a();
        this.f4743a = new HashMap();
    }
}
