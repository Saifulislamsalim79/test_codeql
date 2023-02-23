package com.google.firebase.crashlytics.p112h.p120n;

import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.AbstractC5402t;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import com.google.firebase.crashlytics.p112h.p117l.C5492b0;
import com.google.firebase.crashlytics.p112h.p117l.p118d0.C5509g;
import com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: CrashlyticsReportPersistence.java */
/* renamed from: com.google.firebase.crashlytics.h.n.g */
/* loaded from: classes2.dex */
public class C5576g {

    /* renamed from: g */
    private static final Charset f13750g = Charset.forName("UTF-8");

    /* renamed from: h */
    private static final int f13751h = 15;

    /* renamed from: i */
    private static final C5509g f13752i = new C5509g();

    /* renamed from: j */
    private static final Comparator<? super File> f13753j = C5574e.f13748c;

    /* renamed from: k */
    private static final FilenameFilter f13754k = C5575f.f13749a;

    /* renamed from: a */
    private final AtomicInteger f13755a = new AtomicInteger(0);

    /* renamed from: b */
    private final File f13756b;

    /* renamed from: c */
    private final File f13757c;

    /* renamed from: d */
    private final File f13758d;

    /* renamed from: e */
    private final File f13759e;

    /* renamed from: f */
    private final InterfaceC5587e f13760f;

    public C5576g(File file, InterfaceC5587e interfaceC5587e) {
        File file2 = new File(file, "report-persistence");
        this.f13756b = new File(file2, "sessions");
        this.f13757c = new File(file2, "priority-reports");
        this.f13758d = new File(file2, "reports");
        this.f13759e = new File(file2, "native-reports");
        this.f13760f = interfaceC5587e;
    }

    /* renamed from: C */
    private static boolean m24447C(File file) {
        return file.exists() || file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static int m24446D(File file, File file2) {
        return m24420m(file.getName()).compareTo(m24420m(file2.getName()));
    }

    /* renamed from: H */
    private static File m24442H(File file) throws IOException {
        if (m24447C(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    /* renamed from: I */
    private static String m24441I(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f13750g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: J */
    private static void m24440J(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m24440J(file2);
            }
        }
        file.delete();
    }

    /* renamed from: K */
    private static List<File> m24439K(List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, f13753j);
        }
        return m24429d(listArr);
    }

    /* renamed from: L */
    private static void m24438L(File file, File file2, AbstractC5448a0.AbstractC5454d abstractC5454d, String str) {
        try {
            AbstractC5448a0 m24759m = f13752i.m24683D(m24441I(file)).m24759m(abstractC5454d);
            m24442H(file2);
            m24434P(new File(file2, str), f13752i.m24682E(m24759m));
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25096l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: M */
    private void m24437M(File file, long j) {
        boolean z;
        List<File> m24418o = m24418o(file, f13754k);
        if (m24418o.isEmpty()) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25099i("Session " + file.getName() + " has no events.");
            return;
        }
        Collections.sort(m24418o);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file2 : m24418o) {
                try {
                    arrayList.add(f13752i.m24681a(m24441I(file2)));
                } catch (IOException e) {
                    C5335f m25102f2 = C5335f.m25102f();
                    m25102f2.m25096l("Could not add event to report for " + file2, e);
                }
                if (z || m24414s(file2.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            C5335f m25102f3 = C5335f.m25102f();
            m25102f3.m25097k("Could not parse event files for session " + file.getName());
            return;
        }
        String str = null;
        File file3 = new File(file, "user");
        if (file3.isFile()) {
            try {
                str = m24441I(file3);
            } catch (IOException e2) {
                C5335f m25102f4 = C5335f.m25102f();
                m25102f4.m25096l("Could not read user ID file in " + file.getName(), e2);
            }
        }
        m24436N(new File(file, "report"), z ? this.f13757c : this.f13758d, arrayList, j, z, str);
    }

    /* renamed from: N */
    private static void m24436N(File file, File file2, List<AbstractC5448a0.AbstractC5458e.AbstractC5465d> list, long j, boolean z, String str) {
        try {
            AbstractC5448a0 m24760l = f13752i.m24683D(m24441I(file)).m24758n(j, z, str).m24760l(C5492b0.m24714d(list));
            AbstractC5448a0.AbstractC5458e mo24725j = m24760l.mo24725j();
            if (mo24725j == null) {
                return;
            }
            m24442H(file2);
            m24434P(new File(file2, mo24725j.mo24638h()), f13752i.m24682E(m24760l));
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25096l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: O */
    private static int m24435O(File file, int i) {
        List<File> m24418o = m24418o(file, C5571b.f13745a);
        Collections.sort(m24418o, C5570a.f13744c);
        return m24431b(m24418o, i);
    }

    /* renamed from: P */
    private static void m24434P(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13750g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: Q */
    private static void m24433Q(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13750g);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m24428e(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private List<File> m24432a(final String str) {
        List<File> m24419n = m24419n(this.f13756b, new FileFilter() { // from class: com.google.firebase.crashlytics.h.n.d
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return C5576g.m24410w(str, file);
            }
        });
        Collections.sort(m24419n, f13753j);
        if (m24419n.size() <= 8) {
            return m24419n;
        }
        for (File file : m24419n.subList(8, m24419n.size())) {
            m24440J(file);
        }
        return m24419n.subList(0, 8);
    }

    /* renamed from: b */
    private static int m24431b(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            m24440J(file);
            size--;
        }
        return size;
    }

    /* renamed from: c */
    private void m24430c() {
        int i = this.f13760f.mo24372b().mo24363b().f13789b;
        List<File> m24421l = m24421l();
        int size = m24421l.size();
        if (size <= i) {
            return;
        }
        for (File file : m24421l.subList(i, size)) {
            file.delete();
        }
    }

    /* renamed from: d */
    private static List<File> m24429d(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> list : listArr) {
            i += list.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* renamed from: e */
    private static long m24428e(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    private static String m24423j(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i));
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    /* renamed from: k */
    private static List<File> m24422k(File file) {
        return m24419n(file, null);
    }

    /* renamed from: l */
    private List<File> m24421l() {
        return m24439K(m24429d(m24422k(this.f13757c), m24422k(this.f13759e)), m24422k(this.f13758d));
    }

    /* renamed from: m */
    private static String m24420m(String str) {
        return str.substring(0, f13751h);
    }

    /* renamed from: n */
    private static List<File> m24419n(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    /* renamed from: o */
    private static List<File> m24418o(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    /* renamed from: p */
    private File m24417p(String str) {
        return new File(this.f13756b, str);
    }

    /* renamed from: s */
    private static boolean m24414s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m24413t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static /* synthetic */ boolean m24410w(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    /* renamed from: A */
    public List<String> m24449A() {
        List<File> m24422k = m24422k(this.f13756b);
        Collections.sort(m24422k, f13753j);
        ArrayList arrayList = new ArrayList();
        for (File file : m24422k) {
            arrayList.add(file.getName());
        }
        return arrayList;
    }

    /* renamed from: B */
    public List<AbstractC5402t> m24448B() {
        List<File> m24421l = m24421l();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(m24421l.size());
        for (File file : m24421l()) {
            try {
                arrayList.add(AbstractC5402t.m24853a(f13752i.m24683D(m24441I(file)), file.getName()));
            } catch (IOException e) {
                C5335f m25102f = C5335f.m25102f();
                m25102f.m25096l("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public void m24445E(AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d, String str, boolean z) {
        int i = this.f13760f.mo24372b().mo24363b().f13788a;
        File m24417p = m24417p(str);
        try {
            m24434P(new File(m24417p, m24423j(this.f13755a.getAndIncrement(), z)), f13752i.m24680b(abstractC5465d));
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25096l("Could not persist event for session " + str, e);
        }
        m24435O(m24417p, i);
    }

    /* renamed from: F */
    public void m24444F(AbstractC5448a0 abstractC5448a0) {
        AbstractC5448a0.AbstractC5458e mo24725j = abstractC5448a0.mo24725j();
        if (mo24725j == null) {
            C5335f.m25102f().m25106b("Could not get session for report");
            return;
        }
        String mo24638h = mo24725j.mo24638h();
        try {
            File m24417p = m24417p(mo24638h);
            m24442H(m24417p);
            m24434P(new File(m24417p, "report"), f13752i.m24682E(abstractC5448a0));
            m24433Q(new File(m24417p, "start-time"), "", mo24725j.mo24636k());
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25105c("Could not persist report for session " + mo24638h, e);
        }
    }

    /* renamed from: G */
    public void m24443G(String str, String str2) {
        try {
            m24434P(new File(m24417p(str2), "user"), str);
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25096l("Could not persist user ID for session " + str2, e);
        }
    }

    /* renamed from: f */
    public void m24427f() {
        for (File file : m24421l()) {
            file.delete();
        }
    }

    /* renamed from: g */
    public void m24426g(final String str) {
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.google.firebase.crashlytics.h.n.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean startsWith;
                startsWith = str2.startsWith(str);
                return startsWith;
            }
        };
        for (File file : m24429d(m24418o(this.f13757c, filenameFilter), m24418o(this.f13759e, filenameFilter), m24418o(this.f13758d, filenameFilter))) {
            file.delete();
        }
    }

    /* renamed from: h */
    public void m24425h(String str, long j) {
        for (File file : m24432a(str)) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25099i("Finalizing report for session " + file.getName());
            m24437M(file, j);
            m24440J(file);
        }
        m24430c();
    }

    /* renamed from: i */
    public void m24424i(String str, AbstractC5448a0.AbstractC5454d abstractC5454d) {
        m24438L(new File(m24417p(str), "report"), this.f13759e, abstractC5454d, str);
    }

    /* renamed from: q */
    public long m24416q(String str) {
        return new File(m24417p(str), "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m24415r() {
        return !m24421l().isEmpty();
    }
}
