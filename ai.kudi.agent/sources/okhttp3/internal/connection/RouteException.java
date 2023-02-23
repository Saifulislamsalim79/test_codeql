package okhttp3.internal.connection;

import java.io.IOException;
import p565l.p566g0.C14148c;
/* loaded from: classes3.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: c */
    private IOException f31843c;

    /* renamed from: d */
    private IOException f31844d;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f31843c = iOException;
        this.f31844d = iOException;
    }

    /* renamed from: a */
    public void m1615a(IOException iOException) {
        C14148c.m2807a(this.f31843c, iOException);
        this.f31844d = iOException;
    }

    /* renamed from: b */
    public IOException m1614b() {
        return this.f31843c;
    }

    /* renamed from: c */
    public IOException m1613c() {
        return this.f31844d;
    }
}
