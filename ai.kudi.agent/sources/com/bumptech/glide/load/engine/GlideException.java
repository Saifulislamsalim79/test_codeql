package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC2118f;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* renamed from: x */
    private static final StackTraceElement[] f6093x = new StackTraceElement[0];

    /* renamed from: c */
    private final List<Throwable> f6094c;

    /* renamed from: d */
    private InterfaceC2118f f6095d;

    /* renamed from: e */
    private EnumC1993a f6096e;

    /* renamed from: f */
    private Class<?> f6097f;

    /* renamed from: w */
    private String f6098w;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    private void m33942a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).m33938e()) {
                m33942a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m33941b(List<Throwable> list, Appendable appendable) {
        try {
            m33940c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m33940c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m33935h(appendable);
            } else {
                m33939d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m33939d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m33935h(Appendable appendable) {
        m33939d(this, appendable);
        m33941b(m33938e(), new C2005a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> m33938e() {
        return this.f6094c;
    }

    /* renamed from: f */
    public List<Throwable> m33937f() {
        ArrayList arrayList = new ArrayList();
        m33942a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m33936g(String str) {
        List<Throwable> m33937f = m33937f();
        int size = m33937f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), m33937f.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f6098w);
        sb.append(this.f6097f != null ? ", " + this.f6097f : "");
        sb.append(this.f6096e != null ? ", " + this.f6096e : "");
        sb.append(this.f6095d != null ? ", " + this.f6095d : "");
        List<Throwable> m33937f = m33937f();
        if (m33937f.isEmpty()) {
            return sb.toString();
        }
        if (m33937f.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(m33937f.size());
            sb.append(" causes:");
        }
        for (Throwable th : m33937f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m33934i(InterfaceC2118f interfaceC2118f, EnumC1993a enumC1993a) {
        m33933j(interfaceC2118f, enumC1993a, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m33933j(InterfaceC2118f interfaceC2118f, EnumC1993a enumC1993a, Class<?> cls) {
        this.f6095d = interfaceC2118f;
        this.f6096e = enumC1993a;
        this.f6097f = cls;
    }

    /* renamed from: k */
    public void m33932k(Exception exc) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m33935h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f6098w = str;
        setStackTrace(f6093x);
        this.f6094c = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m33935h(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    /* loaded from: classes2.dex */
    public static final class C2005a implements Appendable {

        /* renamed from: c */
        private final Appendable f6099c;

        /* renamed from: d */
        private boolean f6100d = true;

        C2005a(Appendable appendable) {
            this.f6099c = appendable;
        }

        /* renamed from: a */
        private CharSequence m33931a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f6100d) {
                this.f6100d = false;
                this.f6099c.append("  ");
            }
            this.f6100d = c == '\n';
            this.f6099c.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence m33931a = m33931a(charSequence);
            append(m33931a, 0, m33931a.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence m33931a = m33931a(charSequence);
            boolean z = false;
            if (this.f6100d) {
                this.f6100d = false;
                this.f6099c.append("  ");
            }
            if (m33931a.length() > 0 && m33931a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f6100d = z;
            this.f6099c.append(m33931a, i, i2);
            return this;
        }
    }
}
