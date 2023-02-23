package pl.droidsonroids.relinker;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import pl.droidsonroids.relinker.C14761b;
import pl.droidsonroids.relinker.p604f.C14779i;
/* compiled from: ReLinkerInstance.java */
/* renamed from: pl.droidsonroids.relinker.c */
/* loaded from: classes3.dex */
public class C14766c {

    /* renamed from: a */
    protected final Set<String> f33020a;

    /* renamed from: b */
    protected final C14761b.InterfaceC14763b f33021b;

    /* renamed from: c */
    protected final C14761b.InterfaceC14762a f33022c;

    /* renamed from: d */
    protected boolean f33023d;

    /* renamed from: e */
    protected boolean f33024e;

    /* renamed from: f */
    protected C14761b.InterfaceC14765d f33025f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReLinkerInstance.java */
    /* renamed from: pl.droidsonroids.relinker.c$a */
    /* loaded from: classes3.dex */
    public class RunnableC14767a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Context f33026c;

        /* renamed from: d */
        final /* synthetic */ String f33027d;

        /* renamed from: e */
        final /* synthetic */ String f33028e;

        /* renamed from: f */
        final /* synthetic */ C14761b.InterfaceC14764c f33029f;

        RunnableC14767a(Context context, String str, String str2, C14761b.InterfaceC14764c interfaceC14764c) {
            this.f33026c = context;
            this.f33027d = str;
            this.f33028e = str2;
            this.f33029f = interfaceC14764c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C14766c.this.m372g(this.f33026c, this.f33027d, this.f33028e);
                this.f33029f.m381a();
            } catch (UnsatisfiedLinkError e) {
                this.f33029f.m380b(e);
            } catch (MissingLibraryException e2) {
                this.f33029f.m380b(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReLinkerInstance.java */
    /* renamed from: pl.droidsonroids.relinker.c$b */
    /* loaded from: classes3.dex */
    public class C14768b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f33031a;

        C14768b(C14766c c14766c, String str) {
            this.f33031a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f33031a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C14766c() {
        this(new C14769d(), new C14759a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m372g(Context context, String str, String str2) {
        if (this.f33020a.contains(str) && !this.f33023d) {
            m370i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f33021b.loadLibrary(str);
            this.f33020a.add(str);
            m370i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            m370i("Loading the library normally failed: %s", Log.getStackTraceString(e));
            m370i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File m375d = m375d(context, str, str2);
            if (!m375d.exists() || this.f33023d) {
                if (this.f33023d) {
                    m370i("Forcing a re-link of %s (%s)...", str, str2);
                }
                m377b(context, str, str2);
                this.f33022c.mo382a(context, this.f33021b.mo367c(), this.f33021b.mo369a(str), m375d, this);
            }
            try {
                if (this.f33024e) {
                    C14779i c14779i = null;
                    try {
                        C14779i c14779i2 = new C14779i(m375d);
                        try {
                            List<String> m353m = c14779i2.m353m();
                            c14779i2.close();
                            for (String str3 : m353m) {
                                m374e(context, this.f33021b.mo368b(str3));
                            }
                        } catch (Throwable th) {
                            th = th;
                            c14779i = c14779i2;
                            c14779i.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.f33021b.mo366d(m375d.getAbsolutePath());
            this.f33020a.add(str);
            m370i("%s (%s) was re-linked!", str, str2);
        }
    }

    /* renamed from: b */
    protected void m377b(Context context, String str, String str2) {
        File m376c = m376c(context);
        File m375d = m375d(context, str, str2);
        File[] listFiles = m376c.listFiles(new C14768b(this, this.f33021b.mo369a(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f33023d || !file.getAbsolutePath().equals(m375d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    protected File m376c(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: d */
    protected File m375d(Context context, String str, String str2) {
        String mo369a = this.f33021b.mo369a(str);
        if (C14770e.m365a(str2)) {
            return new File(m376c(context), mo369a);
        }
        File m376c = m376c(context);
        return new File(m376c, mo369a + "." + str2);
    }

    /* renamed from: e */
    public void m374e(Context context, String str) {
        m373f(context, str, null, null);
    }

    /* renamed from: f */
    public void m373f(Context context, String str, String str2, C14761b.InterfaceC14764c interfaceC14764c) {
        if (context != null) {
            if (!C14770e.m365a(str)) {
                m370i("Beginning load of %s...", str);
                if (interfaceC14764c == null) {
                    m372g(context, str, str2);
                    return;
                } else {
                    new Thread(new RunnableC14767a(context, str, str2, interfaceC14764c)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    /* renamed from: h */
    public void m371h(String str) {
        C14761b.InterfaceC14765d interfaceC14765d = this.f33025f;
        if (interfaceC14765d != null) {
            interfaceC14765d.m379a(str);
        }
    }

    /* renamed from: i */
    public void m370i(String str, Object... objArr) {
        m371h(String.format(Locale.US, str, objArr));
    }

    protected C14766c(C14761b.InterfaceC14763b interfaceC14763b, C14761b.InterfaceC14762a interfaceC14762a) {
        this.f33020a = new HashSet();
        if (interfaceC14763b == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (interfaceC14762a != null) {
            this.f33021b = interfaceC14763b;
            this.f33022c = interfaceC14762a;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }
}
