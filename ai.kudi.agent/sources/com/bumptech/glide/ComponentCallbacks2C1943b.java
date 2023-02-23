package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.C2064k;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2025h;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.p070m.C2143k;
import com.bumptech.glide.load.p070m.C2146m;
import com.bumptech.glide.load.p072n.C2158a;
import com.bumptech.glide.load.p072n.C2162b;
import com.bumptech.glide.load.p072n.C2169c;
import com.bumptech.glide.load.p072n.C2170d;
import com.bumptech.glide.load.p072n.C2173e;
import com.bumptech.glide.load.p072n.C2178f;
import com.bumptech.glide.load.p072n.C2186g;
import com.bumptech.glide.load.p072n.C2192k;
import com.bumptech.glide.load.p072n.C2211s;
import com.bumptech.glide.load.p072n.C2216t;
import com.bumptech.glide.load.p072n.C2217u;
import com.bumptech.glide.load.p072n.C2221v;
import com.bumptech.glide.load.p072n.C2224w;
import com.bumptech.glide.load.p072n.C2229x;
import com.bumptech.glide.load.p072n.p073y.C2231a;
import com.bumptech.glide.load.p072n.p073y.C2233b;
import com.bumptech.glide.load.p072n.p073y.C2235c;
import com.bumptech.glide.load.p072n.p073y.C2237d;
import com.bumptech.glide.load.p072n.p073y.C2239e;
import com.bumptech.glide.load.p072n.p073y.C2244f;
import com.bumptech.glide.load.p074o.p075d.C2251a;
import com.bumptech.glide.load.p074o.p076e.C2257d;
import com.bumptech.glide.load.p074o.p076e.C2258e;
import com.bumptech.glide.load.p074o.p077f.C2259a;
import com.bumptech.glide.load.p074o.p078g.C2261a;
import com.bumptech.glide.load.p074o.p078g.C2265c;
import com.bumptech.glide.load.p074o.p078g.C2267d;
import com.bumptech.glide.load.p074o.p078g.C2275h;
import com.bumptech.glide.load.p074o.p078g.C2277j;
import com.bumptech.glide.load.p074o.p079h.C2278a;
import com.bumptech.glide.load.p074o.p079h.C2279b;
import com.bumptech.glide.load.p074o.p079h.C2280c;
import com.bumptech.glide.load.p074o.p079h.C2281d;
import com.bumptech.glide.load.resource.bitmap.C2289a;
import com.bumptech.glide.load.resource.bitmap.C2290b;
import com.bumptech.glide.load.resource.bitmap.C2291c;
import com.bumptech.glide.load.resource.bitmap.C2294f;
import com.bumptech.glide.load.resource.bitmap.C2295g;
import com.bumptech.glide.load.resource.bitmap.C2301i;
import com.bumptech.glide.load.resource.bitmap.C2307l;
import com.bumptech.glide.load.resource.bitmap.C2312o;
import com.bumptech.glide.load.resource.bitmap.C2314q;
import com.bumptech.glide.load.resource.bitmap.C2317s;
import com.bumptech.glide.load.resource.bitmap.C2318t;
import com.bumptech.glide.load.resource.bitmap.C2322v;
import com.bumptech.glide.load.resource.bitmap.C2324w;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.p065k.InterfaceC1965a;
import com.bumptech.glide.p066l.C1985l;
import com.bumptech.glide.p066l.InterfaceC1975d;
import com.bumptech.glide.p080m.C2336d;
import com.bumptech.glide.p080m.InterfaceC2334b;
import com.bumptech.glide.p082o.C2352f;
import com.bumptech.glide.p082o.InterfaceC2351e;
import com.bumptech.glide.p082o.p083j.C2358b;
import com.bumptech.glide.p082o.p083j.InterfaceC2360d;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: Glide.java */
/* renamed from: com.bumptech.glide.b */
/* loaded from: classes2.dex */
public class ComponentCallbacks2C1943b implements ComponentCallbacks2 {

    /* renamed from: A */
    private static volatile ComponentCallbacks2C1943b f5874A;

    /* renamed from: B */
    private static volatile boolean f5875B;

    /* renamed from: c */
    private final InterfaceC2100e f5876c;

    /* renamed from: d */
    private final InterfaceC2025h f5877d;

    /* renamed from: e */
    private final C1947d f5878e;

    /* renamed from: f */
    private final Registry f5879f;

    /* renamed from: w */
    private final InterfaceC2095b f5880w;

    /* renamed from: x */
    private final C1985l f5881x;

    /* renamed from: y */
    private final InterfaceC1975d f5882y;

    /* renamed from: z */
    private final List<ComponentCallbacks2C1952h> f5883z = new ArrayList();

    /* compiled from: Glide.java */
    /* renamed from: com.bumptech.glide.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1944a {
        C2352f build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacks2C1943b(Context context, C2064k c2064k, InterfaceC2025h interfaceC2025h, InterfaceC2100e interfaceC2100e, InterfaceC2095b interfaceC2095b, C1985l c1985l, InterfaceC1975d interfaceC1975d, int i, InterfaceC1944a interfaceC1944a, Map<Class<?>, AbstractC1955i<?, ?>> map, List<InterfaceC2351e<Object>> list, boolean z, boolean z2) {
        InterfaceC2124j c2294f;
        InterfaceC2124j c2318t;
        Object obj;
        EnumC1948e enumC1948e = EnumC1948e.NORMAL;
        this.f5876c = interfaceC2100e;
        this.f5880w = interfaceC2095b;
        this.f5877d = interfaceC2025h;
        this.f5881x = c1985l;
        this.f5882y = interfaceC1975d;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f5879f = registry;
        registry.m34175o(new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            this.f5879f.m34175o(new C2307l());
        }
        List<ImageHeaderParser> m34183g = this.f5879f.m34183g();
        C2261a c2261a = new C2261a(context, m34183g, interfaceC2100e, interfaceC2095b);
        InterfaceC2124j<ParcelFileDescriptor, Bitmap> m33294h = C2324w.m33294h(interfaceC2100e);
        C2301i c2301i = new C2301i(this.f5879f.m34183g(), resources.getDisplayMetrics(), interfaceC2100e, interfaceC2095b);
        if (z2 && Build.VERSION.SDK_INT >= 28) {
            c2318t = new C2312o();
            c2294f = new C2295g();
        } else {
            c2294f = new C2294f(c2301i);
            c2318t = new C2318t(c2301i, interfaceC2095b);
        }
        C2257d c2257d = new C2257d(context);
        C2211s.C2214c c2214c = new C2211s.C2214c(resources);
        C2211s.C2215d c2215d = new C2211s.C2215d(resources);
        C2211s.C2213b c2213b = new C2211s.C2213b(resources);
        C2211s.C2212a c2212a = new C2211s.C2212a(resources);
        C2291c c2291c = new C2291c(interfaceC2095b);
        C2278a c2278a = new C2278a();
        C2281d c2281d = new C2281d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry registry2 = this.f5879f;
        registry2.m34189a(ByteBuffer.class, new C2169c());
        registry2.m34189a(InputStream.class, new C2216t(interfaceC2095b));
        registry2.m34185e("Bitmap", ByteBuffer.class, Bitmap.class, c2294f);
        registry2.m34185e("Bitmap", InputStream.class, Bitmap.class, c2318t);
        if (C2146m.m33638c()) {
            obj = InterfaceC1965a.class;
            this.f5879f.m34185e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C2314q(c2301i));
        } else {
            obj = InterfaceC1965a.class;
        }
        Registry registry3 = this.f5879f;
        registry3.m34185e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m33294h);
        registry3.m34185e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C2324w.m33299c(interfaceC2100e));
        registry3.m34186d(Bitmap.class, Bitmap.class, C2221v.C2222a.m33524a());
        registry3.m34185e("Bitmap", Bitmap.class, Bitmap.class, new C2322v());
        registry3.m34188b(Bitmap.class, c2291c);
        registry3.m34185e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2289a(resources, c2294f));
        registry3.m34185e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2289a(resources, c2318t));
        registry3.m34185e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2289a(resources, m33294h));
        registry3.m34188b(BitmapDrawable.class, new C2290b(interfaceC2100e, c2291c));
        registry3.m34185e("Gif", InputStream.class, C2265c.class, new C2277j(m34183g, c2261a, interfaceC2095b));
        registry3.m34185e("Gif", ByteBuffer.class, C2265c.class, c2261a);
        registry3.m34188b(C2265c.class, new C2267d());
        Object obj2 = obj;
        registry3.m34186d(obj2, obj2, C2221v.C2222a.m33524a());
        registry3.m34185e("Bitmap", obj2, Bitmap.class, new C2275h(interfaceC2100e));
        registry3.m34187c(Uri.class, Drawable.class, c2257d);
        registry3.m34187c(Uri.class, Bitmap.class, new C2317s(c2257d, interfaceC2100e));
        registry3.m34174p(new C2251a.C2252a());
        registry3.m34186d(File.class, ByteBuffer.class, new C2170d.C2172b());
        registry3.m34186d(File.class, InputStream.class, new C2178f.C2184e());
        registry3.m34187c(File.class, File.class, new C2259a());
        registry3.m34186d(File.class, ParcelFileDescriptor.class, new C2178f.C2180b());
        registry3.m34186d(File.class, File.class, C2221v.C2222a.m33524a());
        registry3.m34174p(new C2143k.C2144a(interfaceC2095b));
        if (C2146m.m33638c()) {
            this.f5879f.m34174p(new C2146m.C2147a());
        }
        Registry registry4 = this.f5879f;
        registry4.m34186d(Integer.TYPE, InputStream.class, c2214c);
        registry4.m34186d(Integer.TYPE, ParcelFileDescriptor.class, c2213b);
        registry4.m34186d(Integer.class, InputStream.class, c2214c);
        registry4.m34186d(Integer.class, ParcelFileDescriptor.class, c2213b);
        registry4.m34186d(Integer.class, Uri.class, c2215d);
        registry4.m34186d(Integer.TYPE, AssetFileDescriptor.class, c2212a);
        registry4.m34186d(Integer.class, AssetFileDescriptor.class, c2212a);
        registry4.m34186d(Integer.TYPE, Uri.class, c2215d);
        registry4.m34186d(String.class, InputStream.class, new C2173e.C2176c());
        registry4.m34186d(Uri.class, InputStream.class, new C2173e.C2176c());
        registry4.m34186d(String.class, InputStream.class, new C2217u.C2220c());
        registry4.m34186d(String.class, ParcelFileDescriptor.class, new C2217u.C2219b());
        registry4.m34186d(String.class, AssetFileDescriptor.class, new C2217u.C2218a());
        registry4.m34186d(Uri.class, InputStream.class, new C2233b.C2234a());
        registry4.m34186d(Uri.class, InputStream.class, new C2158a.C2161c(context.getAssets()));
        registry4.m34186d(Uri.class, ParcelFileDescriptor.class, new C2158a.C2160b(context.getAssets()));
        registry4.m34186d(Uri.class, InputStream.class, new C2235c.C2236a(context));
        registry4.m34186d(Uri.class, InputStream.class, new C2237d.C2238a(context));
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5879f.m34186d(Uri.class, InputStream.class, new C2239e.C2242c(context));
            this.f5879f.m34186d(Uri.class, ParcelFileDescriptor.class, new C2239e.C2241b(context));
        }
        Registry registry5 = this.f5879f;
        registry5.m34186d(Uri.class, InputStream.class, new C2224w.C2228d(contentResolver));
        registry5.m34186d(Uri.class, ParcelFileDescriptor.class, new C2224w.C2226b(contentResolver));
        registry5.m34186d(Uri.class, AssetFileDescriptor.class, new C2224w.C2225a(contentResolver));
        registry5.m34186d(Uri.class, InputStream.class, new C2229x.C2230a());
        registry5.m34186d(URL.class, InputStream.class, new C2244f.C2245a());
        registry5.m34186d(Uri.class, File.class, new C2192k.C2193a(context));
        registry5.m34186d(C2186g.class, InputStream.class, new C2231a.C2232a());
        registry5.m34186d(byte[].class, ByteBuffer.class, new C2162b.C2163a());
        registry5.m34186d(byte[].class, InputStream.class, new C2162b.C2167d());
        registry5.m34186d(Uri.class, Uri.class, C2221v.C2222a.m33524a());
        registry5.m34186d(Drawable.class, Drawable.class, C2221v.C2222a.m33524a());
        registry5.m34187c(Drawable.class, Drawable.class, new C2258e());
        registry5.m34173q(Bitmap.class, BitmapDrawable.class, new C2279b(resources));
        registry5.m34173q(Bitmap.class, byte[].class, c2278a);
        registry5.m34173q(Drawable.class, byte[].class, new C2280c(interfaceC2100e, c2278a, c2281d));
        registry5.m34173q(C2265c.class, byte[].class, c2281d);
        if (Build.VERSION.SDK_INT >= 23) {
            InterfaceC2124j<ByteBuffer, Bitmap> m33298d = C2324w.m33298d(interfaceC2100e);
            this.f5879f.m34187c(ByteBuffer.class, Bitmap.class, m33298d);
            this.f5879f.m34187c(ByteBuffer.class, BitmapDrawable.class, new C2289a(resources, m33298d));
        }
        this.f5878e = new C1947d(context, interfaceC2095b, this.f5879f, new C2358b(), interfaceC1944a, map, list, c2064k, z, i);
    }

    /* renamed from: a */
    private static void m34171a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f5875B) {
            f5875B = true;
            m34159m(context, generatedAppGlideModule);
            f5875B = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static ComponentCallbacks2C1943b m34169c(Context context) {
        if (f5874A == null) {
            GeneratedAppGlideModule m34168d = m34168d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C1943b.class) {
                if (f5874A == null) {
                    m34171a(context, m34168d);
                }
            }
        }
        return f5874A;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m34168d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            m34155q(e);
            throw null;
        } catch (InstantiationException e2) {
            m34155q(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m34155q(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m34155q(e4);
            throw null;
        }
    }

    /* renamed from: l */
    private static C1985l m34160l(Context context) {
        C2380j.m33128e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m34169c(context).m34161k();
    }

    /* renamed from: m */
    private static void m34159m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m34158n(context, new C1945c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m34158n(Context context, C1945c c1945c, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<InterfaceC2334b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.m33284c()) {
            emptyList = new C2336d(applicationContext).m33280a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m34191d().isEmpty()) {
            Set<Class<?>> m34191d = generatedAppGlideModule.m34191d();
            Iterator<InterfaceC2334b> it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC2334b next = it.next();
                if (m34191d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC2334b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        c1945c.m34150b(generatedAppGlideModule != null ? generatedAppGlideModule.m34190e() : null);
        for (InterfaceC2334b interfaceC2334b : emptyList) {
            interfaceC2334b.m33283a(applicationContext, c1945c);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m33285b(applicationContext, c1945c);
        }
        ComponentCallbacks2C1943b m34151a = c1945c.m34151a(applicationContext);
        for (InterfaceC2334b interfaceC2334b2 : emptyList) {
            try {
                interfaceC2334b2.m33282b(applicationContext, m34151a, m34151a.f5879f);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC2334b2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m33281a(applicationContext, m34151a, m34151a.f5879f);
        }
        applicationContext.registerComponentCallbacks(m34151a);
        f5874A = m34151a;
    }

    /* renamed from: q */
    private static void m34155q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C1952h m34152t(Context context) {
        return m34160l(context).m33986e(context);
    }

    /* renamed from: b */
    public void m34170b() {
        C2381k.m33127a();
        this.f5877d.m33910b();
        this.f5876c.mo33698b();
        this.f5880w.mo33717b();
    }

    /* renamed from: e */
    public InterfaceC2095b m34167e() {
        return this.f5880w;
    }

    /* renamed from: f */
    public InterfaceC2100e m34166f() {
        return this.f5876c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC1975d m34165g() {
        return this.f5882y;
    }

    /* renamed from: h */
    public Context m34164h() {
        return this.f5878e.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C1947d m34163i() {
        return this.f5878e;
    }

    /* renamed from: j */
    public Registry m34162j() {
        return this.f5879f;
    }

    /* renamed from: k */
    public C1985l m34161k() {
        return this.f5881x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m34157o(ComponentCallbacks2C1952h componentCallbacks2C1952h) {
        synchronized (this.f5883z) {
            if (!this.f5883z.contains(componentCallbacks2C1952h)) {
                this.f5883z.add(componentCallbacks2C1952h);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m34170b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m34154r(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m34156p(InterfaceC2360d<?> interfaceC2360d) {
        synchronized (this.f5883z) {
            for (ComponentCallbacks2C1952h componentCallbacks2C1952h : this.f5883z) {
                if (componentCallbacks2C1952h.m34111t(interfaceC2360d)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void m34154r(int i) {
        C2381k.m33127a();
        for (ComponentCallbacks2C1952h componentCallbacks2C1952h : this.f5883z) {
            componentCallbacks2C1952h.onTrimMemory(i);
        }
        this.f5877d.mo33911a(i);
        this.f5876c.mo33699a(i);
        this.f5880w.mo33718a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m34153s(ComponentCallbacks2C1952h componentCallbacks2C1952h) {
        synchronized (this.f5883z) {
            if (this.f5883z.contains(componentCallbacks2C1952h)) {
                this.f5883z.remove(componentCallbacks2C1952h);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
