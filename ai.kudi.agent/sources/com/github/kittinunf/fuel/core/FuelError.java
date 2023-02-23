package com.github.kittinunf.fuel.core;

import com.github.kittinunf.fuel.core.C2500u;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.p549l0.C13272o;
/* compiled from: FuelError.kt */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010\u0007\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002j\u0002`\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002j\u0002`\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0013\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m10421d2 = {"Lcom/github/kittinunf/fuel/core/FuelError;", "Ljava/lang/Exception;", "", "Ljava/lang/StackTraceElement;", "Lcom/github/kittinunf/fuel/core/StackTrace;", "wrapped", "cause", "buildRelativeStack", "([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;", "", "toString", "()Ljava/lang/String;", "", "getCausedByInterruption", "()Z", "causedByInterruption", "", "getErrorData", "()[B", "errorData", "", "getException", "()Ljava/lang/Throwable;", "exception", "Lcom/github/kittinunf/fuel/core/Response;", "response", "Lcom/github/kittinunf/fuel/core/Response;", "getResponse", "()Lcom/github/kittinunf/fuel/core/Response;", "<init>", "(Ljava/lang/Throwable;Lcom/github/kittinunf/fuel/core/Response;)V", "Companion", "fuel"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public class FuelError extends Exception {

    /* renamed from: d */
    public static final C2422a f6968d = new C2422a(null);

    /* renamed from: c */
    private final C2500u f6969c;

    /* compiled from: FuelError.kt */
    /* renamed from: com.github.kittinunf.fuel.core.FuelError$a */
    /* loaded from: classes2.dex */
    public static final class C2422a {
        private C2422a() {
        }

        /* renamed from: b */
        public static /* synthetic */ FuelError m32898b(C2422a c2422a, Throwable th, C2500u c2500u, int i, Object obj) {
            if ((i & 2) != 0) {
                c2500u = C2500u.C2501a.m32720b(C2500u.f7122g, null, 1, null);
            }
            return c2422a.m32899a(th, c2500u);
        }

        /* renamed from: a */
        public final FuelError m32899a(Throwable th, C2500u c2500u) {
            kotlin.e0.d.l.g(th, "it");
            kotlin.e0.d.l.g(c2500u, "response");
            return th instanceof C2426c ? new C2426c(((C2426c) th).m32895e()) : th instanceof FuelError ? new C2426c((FuelError) th) : new FuelError(th, c2500u);
        }

        public /* synthetic */ C2422a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuelError(Throwable th, C2500u c2500u) {
        super(th.getMessage(), th);
        kotlin.e0.d.l.g(th, "exception");
        kotlin.e0.d.l.g(c2500u, "response");
        this.f6969c = c2500u;
        StackTraceElement[] stackTrace = getStackTrace();
        kotlin.e0.d.l.c(stackTrace, "this.stackTrace");
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        kotlin.e0.d.l.c(stackTrace2, "exception.stackTrace");
        setStackTrace(m32903a(stackTrace, stackTrace2));
    }

    /* renamed from: a */
    private final StackTraceElement[] m32903a(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement stackTraceElement;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement2 : stackTraceElementArr) {
            int length = stackTraceElementArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = stackTraceElementArr2[i];
                if (kotlin.e0.d.l.b(stackTraceElement, stackTraceElement2)) {
                    break;
                }
                i++;
            }
            if (!(stackTraceElement == null)) {
                break;
            }
            arrayList.add(stackTraceElement2);
        }
        Object[] array = arrayList.toArray(new StackTraceElement[0]);
        if (array != null) {
            return (StackTraceElement[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public final boolean m32902b() {
        return (m32901c() instanceof InterruptedException) || (m32901c() instanceof InterruptedIOException);
    }

    /* renamed from: c */
    public final Throwable m32901c() {
        Throwable th = this;
        while ((th instanceof FuelError) && th.getCause() != null) {
            th = th.getCause();
            if (th == null) {
                kotlin.e0.d.l.o();
                throw null;
            }
        }
        return th;
    }

    /* renamed from: d */
    public final C2500u m32900d() {
        return this.f6969c;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = m32901c().getMessage();
        if (message == null) {
            message = m32901c().getClass().getCanonicalName();
        }
        sb.append(message);
        sb.append("\r\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        StringBuilder sb4 = new StringBuilder();
        StackTraceElement[] stackTrace = getStackTrace();
        kotlin.e0.d.l.c(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append('\t');
            sb5.append(stackTraceElement);
            sb4.append(sb5.toString());
            kotlin.e0.d.l.c(sb4, "append(value)");
            C13272o.m5457i(sb4);
        }
        Throwable cause = getCause();
        if (cause != null) {
            sb4.append("Caused by: ");
            sb4.append(cause.toString());
            kotlin.e0.d.l.c(sb4, "append(value)");
            C13272o.m5457i(sb4);
            if (!(cause instanceof FuelError)) {
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                kotlin.e0.d.l.c(stackTrace2, "it.stackTrace");
                for (StackTraceElement stackTraceElement2 : stackTrace2) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append('\t');
                    sb6.append(stackTraceElement2);
                    sb4.append(sb6.toString());
                    kotlin.e0.d.l.c(sb4, "append(value)");
                    C13272o.m5457i(sb4);
                }
            }
        }
        String sb7 = sb4.toString();
        kotlin.e0.d.l.c(sb7, "StringBuilder().apply(builderAction).toString()");
        sb3.append(sb7);
        return sb3.toString();
    }
}
