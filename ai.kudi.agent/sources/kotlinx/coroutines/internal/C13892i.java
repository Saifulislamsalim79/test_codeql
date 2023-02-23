package kotlinx.coroutines.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.C11709c;
import kotlin.p492io.C11843b;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13742z;
/* compiled from: FastServiceLoader.kt */
/* renamed from: kotlinx.coroutines.internal.i */
/* loaded from: classes3.dex */
public final class C13892i {

    /* renamed from: a */
    public static final C13892i f30372a = new C13892i();

    private C13892i() {
    }

    /* renamed from: a */
    private final <S> S m3501a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m3500b(Class<S> cls, ClassLoader classLoader) {
        List<S> m3825B0;
        try {
            return m3498d(cls, classLoader);
        } catch (Throwable unused) {
            m3825B0 = C13742z.m3825B0(ServiceLoader.load(cls, classLoader));
            return m3825B0;
        }
    }

    /* renamed from: e */
    private final List<String> m3497e(URL url) {
        boolean m5447E;
        String m5432C0;
        String m5424H0;
        String m5432C02;
        String url2 = url.toString();
        m5447E = C13276s.m5447E(url2, "jar", false, 2, null);
        if (m5447E) {
            m5432C0 = C13277t.m5432C0(url2, "jar:file:", null, 2, null);
            m5424H0 = C13277t.m5424H0(m5432C0, '!', null, 2, null);
            m5432C02 = C13277t.m5432C0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m5424H0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m5432C02)), "UTF-8"));
                List<String> m3496f = f30372a.m3496f(bufferedReader);
                C11843b.m10259a(bufferedReader, null);
                jarFile.close();
                return m3496f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        C11709c.m10411a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
        try {
            List<String> m3496f2 = f30372a.m3496f(bufferedReader2);
            C11843b.m10259a(bufferedReader2, null);
            return m3496f2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C11843b.m10259a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    /* renamed from: f */
    private final List<String> m3496f(BufferedReader bufferedReader) {
        List<String> m3825B0;
        String m5422I0;
        CharSequence m5414M0;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m3825B0 = C13742z.m3825B0(linkedHashSet);
                return m3825B0;
            }
            m5422I0 = C13277t.m5422I0(readLine, "#", null, 2, null);
            if (m5422I0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            m5414M0 = C13277t.m5414M0(m5422I0);
            String obj = m5414M0.toString();
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(kotlin.e0.d.l.m("Illegal service provider class name: ", obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List<MainDispatcherFactory> m3499c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C13893j.m3495a()) {
            return m3500b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return m3500b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m3498d(Class<S> cls, ClassLoader classLoader) {
        Set<String> m3821F0;
        int m3867o;
        ArrayList<URL> list = Collections.list(classLoader.getResources(kotlin.e0.d.l.m("META-INF/services/", cls.getName())));
        kotlin.e0.d.l.e(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C13736w.m3850v(arrayList, f30372a.m3497e(url));
        }
        m3821F0 = C13742z.m3821F0(arrayList);
        if (!m3821F0.isEmpty()) {
            m3867o = C13728s.m3867o(m3821F0, 10);
            ArrayList arrayList2 = new ArrayList(m3867o);
            for (String str : m3821F0) {
                arrayList2.add(f30372a.m3501a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
