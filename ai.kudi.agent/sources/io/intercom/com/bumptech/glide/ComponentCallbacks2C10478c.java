package io.intercom.com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.Fragment;
import io.intercom.com.bumptech.glide.load.EnumC10508b;
import io.intercom.com.bumptech.glide.load.engine.C10549j;
import io.intercom.com.bumptech.glide.load.engine.p395b0.C10527a;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h;
import io.intercom.com.bumptech.glide.load.p398m.C10644i;
import io.intercom.com.bumptech.glide.load.p400n.C10656a;
import io.intercom.com.bumptech.glide.load.p400n.C10660b;
import io.intercom.com.bumptech.glide.load.p400n.C10667c;
import io.intercom.com.bumptech.glide.load.p400n.C10668d;
import io.intercom.com.bumptech.glide.load.p400n.C10671e;
import io.intercom.com.bumptech.glide.load.p400n.C10676f;
import io.intercom.com.bumptech.glide.load.p400n.C10684g;
import io.intercom.com.bumptech.glide.load.p400n.C10690k;
import io.intercom.com.bumptech.glide.load.p400n.C10709s;
import io.intercom.com.bumptech.glide.load.p400n.C10713t;
import io.intercom.com.bumptech.glide.load.p400n.C10714u;
import io.intercom.com.bumptech.glide.load.p400n.C10717v;
import io.intercom.com.bumptech.glide.load.p400n.C10720w;
import io.intercom.com.bumptech.glide.load.p400n.C10724x;
import io.intercom.com.bumptech.glide.load.p400n.p401y.C10726a;
import io.intercom.com.bumptech.glide.load.p400n.p401y.C10728b;
import io.intercom.com.bumptech.glide.load.p400n.p401y.C10730c;
import io.intercom.com.bumptech.glide.load.p400n.p401y.C10732d;
import io.intercom.com.bumptech.glide.load.p400n.p401y.C10734e;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10738a;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10739b;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10740c;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10743f;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10767r;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10768s;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10772u;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10774v;
import io.intercom.com.bumptech.glide.load.p402o.p404d.C10778a;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10785e;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10786f;
import io.intercom.com.bumptech.glide.load.p402o.p406f.C10787a;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10789a;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10793c;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10795d;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10803h;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10805j;
import io.intercom.com.bumptech.glide.load.p402o.p408h.C10806a;
import io.intercom.com.bumptech.glide.load.p402o.p408h.C10807b;
import io.intercom.com.bumptech.glide.load.p402o.p408h.C10808c;
import io.intercom.com.bumptech.glide.p393l.InterfaceC10501a;
import io.intercom.com.bumptech.glide.p409m.C10827l;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10817d;
import io.intercom.com.bumptech.glide.p410n.C10838d;
import io.intercom.com.bumptech.glide.p410n.InterfaceC10836b;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.p413k.C10866e;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: Glide.java */
/* renamed from: io.intercom.com.bumptech.glide.c */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C10478c implements ComponentCallbacks2 {

    /* renamed from: A */
    private static volatile ComponentCallbacks2C10478c f23929A;

    /* renamed from: B */
    private static volatile boolean f23930B;

    /* renamed from: c */
    private final InterfaceC10581e f23931c;

    /* renamed from: d */
    private final InterfaceC10612h f23932d;

    /* renamed from: e */
    private final C10480e f23933e;

    /* renamed from: f */
    private final Registry f23934f;

    /* renamed from: w */
    private final InterfaceC10576b f23935w;

    /* renamed from: x */
    private final C10827l f23936x;

    /* renamed from: y */
    private final InterfaceC10817d f23937y;

    /* renamed from: z */
    private final List<C10486i> f23938z = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacks2C10478c(Context context, C10549j c10549j, InterfaceC10612h interfaceC10612h, InterfaceC10581e interfaceC10581e, InterfaceC10576b interfaceC10576b, C10827l c10827l, InterfaceC10817d interfaceC10817d, int i, C10856g c10856g, Map<Class<?>, AbstractC10491j<?, ?>> map) {
        EnumC10481f enumC10481f = EnumC10481f.NORMAL;
        this.f23931c = interfaceC10581e;
        this.f23935w = interfaceC10576b;
        this.f23932d = interfaceC10612h;
        this.f23936x = c10827l;
        this.f23937y = interfaceC10817d;
        new C10527a(interfaceC10612h, interfaceC10581e, (EnumC10508b) c10856g.m12122t().m12593a(C10756k.f24580f));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f23934f = registry;
        registry.m13042o(new C10746i());
        C10756k c10756k = new C10756k(this.f23934f.m13050g(), resources.getDisplayMetrics(), interfaceC10581e, interfaceC10576b);
        C10789a c10789a = new C10789a(context, this.f23934f.m13050g(), interfaceC10581e, interfaceC10576b);
        C10774v c10774v = new C10774v(interfaceC10581e);
        C10743f c10743f = new C10743f(c10756k);
        C10768s c10768s = new C10768s(c10756k, interfaceC10576b);
        C10785e c10785e = new C10785e(context);
        C10709s.C10711b c10711b = new C10709s.C10711b(resources);
        C10709s.C10712c c10712c = new C10709s.C10712c(resources);
        C10709s.C10710a c10710a = new C10709s.C10710a(resources);
        C10740c c10740c = new C10740c();
        Registry registry2 = this.f23934f;
        registry2.m13056a(ByteBuffer.class, new C10667c());
        registry2.m13056a(InputStream.class, new C10713t(interfaceC10576b));
        registry2.m13052e("Bitmap", ByteBuffer.class, Bitmap.class, c10743f);
        registry2.m13052e("Bitmap", InputStream.class, Bitmap.class, c10768s);
        registry2.m13052e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c10774v);
        registry2.m13052e("Bitmap", Bitmap.class, Bitmap.class, new C10772u());
        registry2.m13053d(Bitmap.class, Bitmap.class, C10717v.C10718a.m12475a());
        registry2.m13055b(Bitmap.class, c10740c);
        registry2.m13052e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C10738a(resources, c10743f));
        registry2.m13052e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C10738a(resources, c10768s));
        registry2.m13052e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C10738a(resources, c10774v));
        registry2.m13055b(BitmapDrawable.class, new C10739b(interfaceC10581e, c10740c));
        registry2.m13052e("Gif", InputStream.class, C10793c.class, new C10805j(this.f23934f.m13050g(), c10789a, interfaceC10576b));
        registry2.m13052e("Gif", ByteBuffer.class, C10793c.class, c10789a);
        registry2.m13055b(C10793c.class, new C10795d());
        registry2.m13053d(InterfaceC10501a.class, InterfaceC10501a.class, C10717v.C10718a.m12475a());
        registry2.m13052e("Bitmap", InterfaceC10501a.class, Bitmap.class, new C10803h(interfaceC10581e));
        registry2.m13054c(Uri.class, Drawable.class, c10785e);
        registry2.m13054c(Uri.class, Bitmap.class, new C10767r(c10785e, interfaceC10581e));
        registry2.m13041p(new C10778a.C10779a());
        registry2.m13053d(File.class, ByteBuffer.class, new C10668d.C10670b());
        registry2.m13053d(File.class, InputStream.class, new C10676f.C10682e());
        registry2.m13054c(File.class, File.class, new C10787a());
        registry2.m13053d(File.class, ParcelFileDescriptor.class, new C10676f.C10678b());
        registry2.m13053d(File.class, File.class, C10717v.C10718a.m12475a());
        registry2.m13041p(new C10644i.C10645a(interfaceC10576b));
        registry2.m13053d(Integer.TYPE, InputStream.class, c10711b);
        registry2.m13053d(Integer.TYPE, ParcelFileDescriptor.class, c10710a);
        registry2.m13053d(Integer.class, InputStream.class, c10711b);
        registry2.m13053d(Integer.class, ParcelFileDescriptor.class, c10710a);
        registry2.m13053d(Integer.class, Uri.class, c10712c);
        registry2.m13053d(Integer.TYPE, Uri.class, c10712c);
        registry2.m13053d(String.class, InputStream.class, new C10671e.C10674c());
        registry2.m13053d(String.class, InputStream.class, new C10714u.C10716b());
        registry2.m13053d(String.class, ParcelFileDescriptor.class, new C10714u.C10715a());
        registry2.m13053d(Uri.class, InputStream.class, new C10728b.C10729a());
        registry2.m13053d(Uri.class, InputStream.class, new C10656a.C10659c(context.getAssets()));
        registry2.m13053d(Uri.class, ParcelFileDescriptor.class, new C10656a.C10658b(context.getAssets()));
        registry2.m13053d(Uri.class, InputStream.class, new C10730c.C10731a(context));
        registry2.m13053d(Uri.class, InputStream.class, new C10732d.C10733a(context));
        registry2.m13053d(Uri.class, InputStream.class, new C10720w.C10723c(context.getContentResolver()));
        registry2.m13053d(Uri.class, ParcelFileDescriptor.class, new C10720w.C10721a(context.getContentResolver()));
        registry2.m13053d(Uri.class, InputStream.class, new C10724x.C10725a());
        registry2.m13053d(URL.class, InputStream.class, new C10734e.C10735a());
        registry2.m13053d(Uri.class, File.class, new C10690k.C10691a(context));
        registry2.m13053d(C10684g.class, InputStream.class, new C10726a.C10727a());
        registry2.m13053d(byte[].class, ByteBuffer.class, new C10660b.C10661a());
        registry2.m13053d(byte[].class, InputStream.class, new C10660b.C10665d());
        registry2.m13053d(Uri.class, Uri.class, C10717v.C10718a.m12475a());
        registry2.m13053d(Drawable.class, Drawable.class, C10717v.C10718a.m12475a());
        registry2.m13054c(Drawable.class, Drawable.class, new C10786f());
        registry2.m13040q(Bitmap.class, BitmapDrawable.class, new C10807b(resources));
        registry2.m13040q(Bitmap.class, byte[].class, new C10806a());
        registry2.m13040q(C10793c.class, byte[].class, new C10808c());
        this.f23933e = new C10480e(context, interfaceC10576b, this.f23934f, new C10866e(), c10856g, map, c10549j, i);
    }

    /* renamed from: a */
    private static void m13036a(Context context) {
        if (!f23930B) {
            f23930B = true;
            m13024m(context);
            f23930B = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static ComponentCallbacks2C10478c m13034c(Context context) {
        if (f23929A == null) {
            synchronized (ComponentCallbacks2C10478c.class) {
                if (f23929A == null) {
                    m13036a(context);
                }
            }
        }
        return f23929A;
    }

    /* renamed from: d */
    private static AbstractC10476a m13033d() {
        try {
            return (AbstractC10476a) Class.forName("io.intercom.com.bumptech.glide.GeneratedAppGlideModuleImpl").newInstance();
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        }
    }

    /* renamed from: l */
    private static C10827l m13025l(Context context) {
        C10892h.m12013e(context, "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m13034c(context).m13026k();
    }

    /* renamed from: m */
    private static void m13024m(Context context) {
        m13023n(context, new C10479d());
    }

    /* renamed from: n */
    private static void m13023n(Context context, C10479d c10479d) {
        Context applicationContext = context.getApplicationContext();
        AbstractC10476a m13033d = m13033d();
        List<InterfaceC10836b> emptyList = Collections.emptyList();
        if (m13033d == null || m13033d.m12212c()) {
            emptyList = new C10838d(applicationContext).m12208a();
        }
        if (m13033d != null && !m13033d.m13038d().isEmpty()) {
            Set<Class<?>> m13038d = m13033d.m13038d();
            Iterator<InterfaceC10836b> it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC10836b next = it.next();
                if (m13038d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC10836b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        c10479d.m13014b(m13033d != null ? m13033d.m13037e() : null);
        for (InterfaceC10836b interfaceC10836b : emptyList) {
            interfaceC10836b.m12211a(applicationContext, c10479d);
        }
        if (m13033d != null) {
            m13033d.m12213b(applicationContext, c10479d);
        }
        ComponentCallbacks2C10478c m13015a = c10479d.m13015a(applicationContext);
        for (InterfaceC10836b interfaceC10836b2 : emptyList) {
            interfaceC10836b2.m12210b(applicationContext, m13015a, m13015a.f23934f);
        }
        if (m13033d != null) {
            m13033d.m12209a(applicationContext, m13015a, m13015a.f23934f);
        }
        applicationContext.registerComponentCallbacks(m13015a);
        f23929A = m13015a;
    }

    /* renamed from: s */
    public static C10486i m13018s(Context context) {
        return m13025l(context).m12242d(context);
    }

    /* renamed from: t */
    public static C10486i m13017t(Fragment fragment) {
        return m13025l(fragment.getActivity()).m12241e(fragment);
    }

    /* renamed from: u */
    public static C10486i m13016u(androidx.fragment.app.i iVar) {
        return m13025l(iVar).m12240f(iVar);
    }

    /* renamed from: b */
    public void m13035b() {
        C10893i.m12011b();
        this.f23932d.m12629b();
        this.f23931c.mo12670b();
        this.f23935w.mo12689b();
    }

    /* renamed from: e */
    public InterfaceC10576b m13032e() {
        return this.f23935w;
    }

    /* renamed from: f */
    public InterfaceC10581e m13031f() {
        return this.f23931c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC10817d m13030g() {
        return this.f23937y;
    }

    /* renamed from: h */
    public Context m13029h() {
        return this.f23933e.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C10480e m13028i() {
        return this.f23933e;
    }

    /* renamed from: j */
    public Registry m13027j() {
        return this.f23934f;
    }

    /* renamed from: k */
    public C10827l m13026k() {
        return this.f23936x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m13022o(C10486i c10486i) {
        synchronized (this.f23938z) {
            if (!this.f23938z.contains(c10486i)) {
                this.f23938z.add(c10486i);
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
        m13035b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m13020q(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m13021p(InterfaceC10869h<?> interfaceC10869h) {
        synchronized (this.f23938z) {
            for (C10486i c10486i : this.f23938z) {
                if (c10486i.m12972n(interfaceC10869h)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q */
    public void m13020q(int i) {
        C10893i.m12011b();
        this.f23932d.mo12630a(i);
        this.f23931c.mo12671a(i);
        this.f23935w.mo12690a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m13019r(C10486i c10486i) {
        synchronized (this.f23938z) {
            if (this.f23938z.contains(c10486i)) {
                this.f23938z.remove(c10486i);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
