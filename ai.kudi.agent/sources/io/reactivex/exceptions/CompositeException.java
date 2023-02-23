package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: c */
    private final List<Throwable> f25140c;

    /* renamed from: d */
    private final String f25141d;

    /* renamed from: e */
    private Throwable f25142e;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    /* loaded from: classes3.dex */
    static final class C11114a extends RuntimeException {
        C11114a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11115b {
        AbstractC11115b() {
        }

        /* renamed from: a */
        abstract void mo11648a(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    /* loaded from: classes3.dex */
    public static final class C11116c extends AbstractC11115b {

        /* renamed from: a */
        private final PrintStream f25143a;

        C11116c(PrintStream printStream) {
            this.f25143a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC11115b
        /* renamed from: a */
        void mo11648a(Object obj) {
            this.f25143a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    /* loaded from: classes3.dex */
    static final class C11117d extends AbstractC11115b {

        /* renamed from: a */
        private final PrintWriter f25144a;

        C11117d(PrintWriter printWriter) {
            this.f25144a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC11115b
        /* renamed from: a */
        void mo11648a(Object obj) {
            this.f25144a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    private void m11653a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m11653a(sb, th.getCause(), "");
        }
    }

    /* renamed from: c */
    private List<Throwable> m11651c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m11649e(AbstractC11115b abstractC11115b) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f25140c) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m11653a(sb, th, "\t");
            i++;
        }
        abstractC11115b.mo11648a(sb.toString());
    }

    /* renamed from: b */
    public List<Throwable> m11652b() {
        return this.f25140c;
    }

    /* renamed from: d */
    Throwable m11650d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f25142e == null) {
            C11114a c11114a = new C11114a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f25140c.iterator();
            C11114a c11114a2 = c11114a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : m11651c(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        c11114a2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    c11114a2 = m11650d(c11114a2);
                }
            }
            this.f25142e = c11114a;
        }
        return this.f25142e;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f25141d;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m11649e(new C11116c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m11649e(new C11117d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m11652b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f25140c = Collections.unmodifiableList(arrayList);
            this.f25141d = this.f25140c.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
