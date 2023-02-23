package com.bumptech.glide.load.engine.p069z;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p086q.C2381k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: SizeConfigStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.z.n */
/* loaded from: classes2.dex */
public class C2114n implements InterfaceC2112l {

    /* renamed from: d */
    private static final Bitmap.Config[] f6401d;

    /* renamed from: e */
    private static final Bitmap.Config[] f6402e;

    /* renamed from: f */
    private static final Bitmap.Config[] f6403f;

    /* renamed from: g */
    private static final Bitmap.Config[] f6404g;

    /* renamed from: h */
    private static final Bitmap.Config[] f6405h;

    /* renamed from: a */
    private final C2117c f6406a = new C2117c();

    /* renamed from: b */
    private final C2103h<C2116b, Bitmap> f6407b = new C2103h<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f6408c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.n$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C2115a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6409a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f6409a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6409a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6409a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6409a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.n$b */
    /* loaded from: classes2.dex */
    public static final class C2116b implements InterfaceC2113m {

        /* renamed from: a */
        private final C2117c f6410a;

        /* renamed from: b */
        int f6411b;

        /* renamed from: c */
        private Bitmap.Config f6412c;

        public C2116b(C2117c c2117c) {
            this.f6410a = c2117c;
        }

        @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2113m
        /* renamed from: a */
        public void mo33673a() {
            this.f6410a.m33735c(this);
        }

        /* renamed from: b */
        public void m33672b(int i, Bitmap.Config config) {
            this.f6411b = i;
            this.f6412c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2116b) {
                C2116b c2116b = (C2116b) obj;
                return this.f6411b == c2116b.f6411b && C2381k.m33125c(this.f6412c, c2116b.f6412c);
            }
            return false;
        }

        public int hashCode() {
            int i = this.f6411b * 31;
            Bitmap.Config config = this.f6412c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C2114n.m33676g(this.f6411b, this.f6412c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.n$c */
    /* loaded from: classes2.dex */
    public static class C2117c extends AbstractC2099d<C2116b> {
        C2117c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p069z.AbstractC2099d
        /* renamed from: d */
        public C2116b mo33671a() {
            return new C2116b(this);
        }

        /* renamed from: e */
        public C2116b m33669e(int i, Bitmap.Config config) {
            C2116b m33736b = m33736b();
            m33736b.m33672b(i, config);
            return m33736b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f6401d = configArr;
        f6402e = configArr;
        f6403f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f6404g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f6405h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: e */
    private void m33678e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m33674i = m33674i(bitmap.getConfig());
        Integer num2 = (Integer) m33674i.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m33674i.remove(num);
                return;
            } else {
                m33674i.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo33679d(bitmap) + ", this: " + this);
    }

    /* renamed from: f */
    private C2116b m33677f(int i, Bitmap.Config config) {
        Bitmap.Config[] m33675h;
        C2116b m33669e = this.f6406a.m33669e(i, config);
        for (Bitmap.Config config2 : m33675h(config)) {
            Integer ceilingKey = m33674i(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return m33669e;
                        }
                    } else if (config2.equals(config)) {
                        return m33669e;
                    }
                }
                this.f6406a.m33735c(m33669e);
                return this.f6406a.m33669e(ceilingKey.intValue(), config2);
            }
        }
        return m33669e;
    }

    /* renamed from: g */
    static String m33676g(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: h */
    private static Bitmap.Config[] m33675h(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f6402e;
        }
        int i = C2115a.f6409a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : f6405h;
                }
                return f6404g;
            }
            return f6403f;
        }
        return f6401d;
    }

    /* renamed from: i */
    private NavigableMap<Integer, Integer> m33674i(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f6408c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f6408c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: a */
    public String mo33682a(int i, int i2, Bitmap.Config config) {
        return m33676g(C2381k.m33122f(i, i2, config), config);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: b */
    public int mo33681b(Bitmap bitmap) {
        return C2381k.m33121g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: c */
    public void mo33680c(Bitmap bitmap) {
        C2116b m33669e = this.f6406a.m33669e(C2381k.m33121g(bitmap), bitmap.getConfig());
        this.f6407b.m33729d(m33669e, bitmap);
        NavigableMap<Integer, Integer> m33674i = m33674i(bitmap.getConfig());
        Integer num = (Integer) m33674i.get(Integer.valueOf(m33669e.f6411b));
        m33674i.put(Integer.valueOf(m33669e.f6411b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: d */
    public String mo33679d(Bitmap bitmap) {
        return m33676g(C2381k.m33121g(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        C2116b m33677f = m33677f(C2381k.m33122f(i, i2, config), config);
        Bitmap m33732a = this.f6407b.m33732a(m33677f);
        if (m33732a != null) {
            m33678e(Integer.valueOf(m33677f.f6411b), m33732a);
            m33732a.reconfigure(i, i2, config);
        }
        return m33732a;
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    public Bitmap removeLast() {
        Bitmap m33727f = this.f6407b.m33727f();
        if (m33727f != null) {
            m33678e(Integer.valueOf(C2381k.m33121g(m33727f)), m33727f);
        }
        return m33727f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f6407b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f6408c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f6408c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
