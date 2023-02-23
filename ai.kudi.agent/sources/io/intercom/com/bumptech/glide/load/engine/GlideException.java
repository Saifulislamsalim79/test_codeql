package io.intercom.com.bumptech.glide.load.engine;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class GlideException extends Exception {

    /* renamed from: w */
    private static final StackTraceElement[] f24117w = new StackTraceElement[0];

    /* renamed from: c */
    private final List<Throwable> f24118c;

    /* renamed from: d */
    private InterfaceC10622g f24119d;

    /* renamed from: e */
    private EnumC10507a f24120e;

    /* renamed from: f */
    private Class<?> f24121f;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: a */
    private void m12872a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).m12868e()) {
                m12872a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m12871b(List<Throwable> list, Appendable appendable) {
        try {
            m12870c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m12870c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m12865h(appendable);
            } else {
                m12869d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m12869d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m12865h(Appendable appendable) {
        m12869d(this, appendable);
        m12871b(m12868e(), new C10513a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> m12868e() {
        return this.f24118c;
    }

    /* renamed from: f */
    public List<Throwable> m12867f() {
        ArrayList arrayList = new ArrayList();
        m12872a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m12866g(String str) {
        List<Throwable> m12867f = m12867f();
        int size = m12867f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), m12867f.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        String str3 = "";
        if (this.f24121f != null) {
            str = ", " + this.f24121f;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f24120e != null) {
            str2 = ", " + this.f24120e;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f24119d != null) {
            str3 = ", " + this.f24119d;
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m12864i(InterfaceC10622g interfaceC10622g, EnumC10507a enumC10507a) {
        m12863j(interfaceC10622g, enumC10507a, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m12863j(InterfaceC10622g interfaceC10622g, EnumC10507a enumC10507a, Class<?> cls) {
        this.f24119d = interfaceC10622g;
        this.f24120e = enumC10507a;
        this.f24121f = cls;
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
        m12865h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        super(str);
        setStackTrace(f24117w);
        this.f24118c = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m12865h(printWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.GlideException$a */
    /* loaded from: classes3.dex */
    public static final class C10513a implements Appendable {

        /* renamed from: c */
        private final Appendable f24122c;

        /* renamed from: d */
        private boolean f24123d = true;

        C10513a(Appendable appendable) {
            this.f24122c = appendable;
        }

        /* renamed from: a */
        private CharSequence m12862a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f24123d) {
                this.f24123d = false;
                this.f24122c.append("  ");
            }
            this.f24123d = c == '\n';
            this.f24122c.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence m12862a = m12862a(charSequence);
            append(m12862a, 0, m12862a.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence m12862a = m12862a(charSequence);
            boolean z = false;
            if (this.f24123d) {
                this.f24123d = false;
                this.f24122c.append("  ");
            }
            if (m12862a.length() > 0 && m12862a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f24123d = z;
            this.f24122c.append(m12862a, i, i2);
            return this;
        }
    }
}
