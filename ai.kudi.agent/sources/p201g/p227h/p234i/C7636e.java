package p201g.p227h.p234i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p201g.p218e.C7527e;
import p201g.p218e.C7534g;
import p201g.p227h.p228e.C7608d;
import p201g.p227h.p234i.C7642f;
import p201g.p227h.p237k.InterfaceC7668a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* renamed from: g.h.i.e */
/* loaded from: classes2.dex */
public class C7636e {

    /* renamed from: a */
    static final C7527e<String, Typeface> f18320a = new C7527e<>(16);

    /* renamed from: b */
    private static final ExecutorService f18321b = C7646g.m17930a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f18322c = new Object();

    /* renamed from: d */
    static final C7534g<String, ArrayList<InterfaceC7668a<C7641e>>> f18323d = new C7534g<>();

    /* compiled from: FontRequestWorker.java */
    /* renamed from: g.h.i.e$a */
    /* loaded from: classes2.dex */
    class CallableC7637a implements Callable<C7641e> {

        /* renamed from: c */
        final /* synthetic */ String f18324c;

        /* renamed from: d */
        final /* synthetic */ Context f18325d;

        /* renamed from: e */
        final /* synthetic */ C7635d f18326e;

        /* renamed from: f */
        final /* synthetic */ int f18327f;

        CallableC7637a(String str, Context context, C7635d c7635d, int i) {
            this.f18324c = str;
            this.f18325d = context;
            this.f18326e = c7635d;
            this.f18327f = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C7641e call() {
            return C7636e.m17950c(this.f18324c, this.f18325d, this.f18326e, this.f18327f);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: g.h.i.e$b */
    /* loaded from: classes2.dex */
    class C7638b implements InterfaceC7668a<C7641e> {

        /* renamed from: a */
        final /* synthetic */ C7629a f18328a;

        C7638b(C7629a c7629a) {
            this.f18328a = c7629a;
        }

        @Override // p201g.p227h.p237k.InterfaceC7668a
        /* renamed from: a */
        public void accept(C7641e c7641e) {
            this.f18328a.m17969b(c7641e);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: g.h.i.e$c */
    /* loaded from: classes2.dex */
    class CallableC7639c implements Callable<C7641e> {

        /* renamed from: c */
        final /* synthetic */ String f18329c;

        /* renamed from: d */
        final /* synthetic */ Context f18330d;

        /* renamed from: e */
        final /* synthetic */ C7635d f18331e;

        /* renamed from: f */
        final /* synthetic */ int f18332f;

        CallableC7639c(String str, Context context, C7635d c7635d, int i) {
            this.f18329c = str;
            this.f18330d = context;
            this.f18331e = c7635d;
            this.f18332f = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C7641e call() {
            return C7636e.m17950c(this.f18329c, this.f18330d, this.f18331e, this.f18332f);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: g.h.i.e$d */
    /* loaded from: classes2.dex */
    class C7640d implements InterfaceC7668a<C7641e> {

        /* renamed from: a */
        final /* synthetic */ String f18333a;

        C7640d(String str) {
            this.f18333a = str;
        }

        @Override // p201g.p227h.p237k.InterfaceC7668a
        /* renamed from: a */
        public void accept(C7641e c7641e) {
            synchronized (C7636e.f18322c) {
                ArrayList<InterfaceC7668a<C7641e>> arrayList = C7636e.f18323d.get(this.f18333a);
                if (arrayList == null) {
                    return;
                }
                C7636e.f18323d.remove(this.f18333a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(c7641e);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m17952a(C7635d c7635d, int i) {
        return c7635d.m17956d() + "-" + i;
    }

    /* renamed from: b */
    private static int m17951b(C7642f.C7643a c7643a) {
        int i = 1;
        if (c7643a.m17939c() != 0) {
            return c7643a.m17939c() != 1 ? -3 : -2;
        }
        C7642f.C7644b[] m17940b = c7643a.m17940b();
        if (m17940b != null && m17940b.length != 0) {
            i = 0;
            for (C7642f.C7644b c7644b : m17940b) {
                int m17937b = c7644b.m17937b();
                if (m17937b != 0) {
                    if (m17937b < 0) {
                        return -3;
                    }
                    return m17937b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C7641e m17950c(String str, Context context, C7635d c7635d, int i) {
        Typeface m18487c = f18320a.m18487c(str);
        if (m18487c != null) {
            return new C7641e(m18487c);
        }
        try {
            C7642f.C7643a m17963d = C7633c.m17963d(context, c7635d, null);
            int m17951b = m17951b(m17963d);
            if (m17951b != 0) {
                return new C7641e(m17951b);
            }
            Typeface m18044b = C7608d.m18044b(context, null, m17963d.m17940b(), i);
            if (m18044b != null) {
                f18320a.m18486d(str, m18044b);
                return new C7641e(m18044b);
            }
            return new C7641e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C7641e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m17949d(Context context, C7635d c7635d, int i, Executor executor, C7629a c7629a) {
        String m17952a = m17952a(c7635d, i);
        Typeface m18487c = f18320a.m18487c(m17952a);
        if (m18487c != null) {
            c7629a.m17969b(new C7641e(m18487c));
            return m18487c;
        }
        C7638b c7638b = new C7638b(c7629a);
        synchronized (f18322c) {
            ArrayList<InterfaceC7668a<C7641e>> arrayList = f18323d.get(m17952a);
            if (arrayList != null) {
                arrayList.add(c7638b);
                return null;
            }
            ArrayList<InterfaceC7668a<C7641e>> arrayList2 = new ArrayList<>();
            arrayList2.add(c7638b);
            f18323d.put(m17952a, arrayList2);
            CallableC7639c callableC7639c = new CallableC7639c(m17952a, context, c7635d, i);
            if (executor == null) {
                executor = f18321b;
            }
            C7646g.m17929b(executor, callableC7639c, new C7640d(m17952a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m17948e(Context context, C7635d c7635d, C7629a c7629a, int i, int i2) {
        String m17952a = m17952a(c7635d, i);
        Typeface m18487c = f18320a.m18487c(m17952a);
        if (m18487c != null) {
            c7629a.m17969b(new C7641e(m18487c));
            return m18487c;
        } else if (i2 == -1) {
            C7641e m17950c = m17950c(m17952a, context, c7635d, i);
            c7629a.m17969b(m17950c);
            return m17950c.f18334a;
        } else {
            try {
                C7641e c7641e = (C7641e) C7646g.m17928c(f18321b, new CallableC7637a(m17952a, context, c7635d, i), i2);
                c7629a.m17969b(c7641e);
                return c7641e.f18334a;
            } catch (InterruptedException unused) {
                c7629a.m17969b(new C7641e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: g.h.i.e$e */
    /* loaded from: classes2.dex */
    public static final class C7641e {

        /* renamed from: a */
        final Typeface f18334a;

        /* renamed from: b */
        final int f18335b;

        C7641e(int i) {
            this.f18334a = null;
            this.f18335b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m17943a() {
            return this.f18335b == 0;
        }

        C7641e(Typeface typeface) {
            this.f18334a = typeface;
            this.f18335b = 0;
        }
    }
}
