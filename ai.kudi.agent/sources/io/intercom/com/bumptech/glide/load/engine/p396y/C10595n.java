package io.intercom.com.bumptech.glide.load.engine.p396y;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: SizeConfigStrategy.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.n */
/* loaded from: classes3.dex */
public class C10595n implements InterfaceC10593l {

    /* renamed from: d */
    private static final Bitmap.Config[] f24374d = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: e */
    private static final Bitmap.Config[] f24375e = {Bitmap.Config.RGB_565};

    /* renamed from: f */
    private static final Bitmap.Config[] f24376f = {Bitmap.Config.ARGB_4444};

    /* renamed from: g */
    private static final Bitmap.Config[] f24377g = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C10598c f24378a = new C10598c();

    /* renamed from: b */
    private final C10584h<C10597b, Bitmap> f24379b = new C10584h<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f24380c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.n$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10596a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24381a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f24381a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24381a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24381a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24381a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.n$b */
    /* loaded from: classes3.dex */
    public static final class C10597b implements InterfaceC10594m {

        /* renamed from: a */
        private final C10598c f24382a;

        /* renamed from: b */
        int f24383b;

        /* renamed from: c */
        private Bitmap.Config f24384c;

        public C10597b(C10598c c10598c) {
            this.f24382a = c10598c;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10594m
        /* renamed from: a */
        public void mo12647a() {
            this.f24382a.m12707c(this);
        }

        /* renamed from: b */
        public void m12646b(int i, Bitmap.Config config) {
            this.f24383b = i;
            this.f24384c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10597b) {
                C10597b c10597b = (C10597b) obj;
                return this.f24383b == c10597b.f24383b && C10893i.m12009d(this.f24384c, c10597b.f24384c);
            }
            return false;
        }

        public int hashCode() {
            int i = this.f24383b * 31;
            Bitmap.Config config = this.f24384c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C10595n.m12650g(this.f24383b, this.f24384c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.n$c */
    /* loaded from: classes3.dex */
    public static class C10598c extends AbstractC10580d<C10597b> {
        C10598c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.AbstractC10580d
        /* renamed from: d */
        public C10597b mo12645a() {
            return new C10597b(this);
        }

        /* renamed from: e */
        public C10597b m12643e(int i, Bitmap.Config config) {
            C10597b m12708b = m12708b();
            m12708b.m12646b(i, config);
            return m12708b;
        }
    }

    /* renamed from: e */
    private void m12652e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m12648i = m12648i(bitmap.getConfig());
        Integer num2 = (Integer) m12648i.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m12648i.remove(num);
                return;
            } else {
                m12648i.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo12653d(bitmap) + ", this: " + this);
    }

    /* renamed from: f */
    private C10597b m12651f(int i, Bitmap.Config config) {
        Bitmap.Config[] m12649h;
        C10597b m12643e = this.f24378a.m12643e(i, config);
        for (Bitmap.Config config2 : m12649h(config)) {
            Integer ceilingKey = m12648i(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return m12643e;
                        }
                    } else if (config2.equals(config)) {
                        return m12643e;
                    }
                }
                this.f24378a.m12707c(m12643e);
                return this.f24378a.m12643e(ceilingKey.intValue(), config2);
            }
        }
        return m12643e;
    }

    /* renamed from: g */
    static String m12650g(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: h */
    private static Bitmap.Config[] m12649h(Bitmap.Config config) {
        int i = C10596a.f24381a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : f24377g;
                }
                return f24376f;
            }
            return f24375e;
        }
        return f24374d;
    }

    /* renamed from: i */
    private NavigableMap<Integer, Integer> m12648i(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f24380c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f24380c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: a */
    public String mo12656a(int i, int i2, Bitmap.Config config) {
        return m12650g(C10893i.m12006g(i, i2, config), config);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: b */
    public int mo12655b(Bitmap bitmap) {
        return C10893i.m12005h(bitmap);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: c */
    public void mo12654c(Bitmap bitmap) {
        C10597b m12643e = this.f24378a.m12643e(C10893i.m12005h(bitmap), bitmap.getConfig());
        this.f24379b.m12701d(m12643e, bitmap);
        NavigableMap<Integer, Integer> m12648i = m12648i(bitmap.getConfig());
        Integer num = (Integer) m12648i.get(Integer.valueOf(m12643e.f24383b));
        m12648i.put(Integer.valueOf(m12643e.f24383b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: d */
    public String mo12653d(Bitmap bitmap) {
        return m12650g(C10893i.m12005h(bitmap), bitmap.getConfig());
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        C10597b m12651f = m12651f(C10893i.m12006g(i, i2, config), config);
        Bitmap m12704a = this.f24379b.m12704a(m12651f);
        if (m12704a != null) {
            m12652e(Integer.valueOf(m12651f.f24383b), m12704a);
            m12704a.reconfigure(i, i2, m12704a.getConfig() != null ? m12704a.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return m12704a;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    public Bitmap removeLast() {
        Bitmap m12699f = this.f24379b.m12699f();
        if (m12699f != null) {
            m12652e(Integer.valueOf(C10893i.m12005h(m12699f)), m12699f);
        }
        return m12699f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f24379b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f24380c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f24380c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
