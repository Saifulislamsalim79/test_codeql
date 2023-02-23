package io.grpc.p385i1;

import com.google.common.base.C5051n;
import io.grpc.p385i1.p386r.p387j.C9966d;
import io.grpc.p385i1.p386r.p387j.C9978i;
import io.grpc.p385i1.p386r.p387j.EnumC9962a;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p576m.C14342c;
import p576m.C14347f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OkHttpFrameLogger.java */
/* renamed from: io.grpc.i1.i */
/* loaded from: classes2.dex */
public class C9928i {

    /* renamed from: a */
    private final Logger f23404a;

    /* renamed from: b */
    private final Level f23405b;

    /* compiled from: OkHttpFrameLogger.java */
    /* renamed from: io.grpc.i1.i$a */
    /* loaded from: classes2.dex */
    enum EnumC9929a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OkHttpFrameLogger.java */
    /* renamed from: io.grpc.i1.i$b */
    /* loaded from: classes2.dex */
    public enum EnumC9930b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: c */
        private final int f23416c;

        EnumC9930b(int i) {
            this.f23416c = i;
        }

        /* renamed from: a */
        public int m13580a() {
            return this.f23416c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9928i(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    /* renamed from: a */
    private boolean m13593a() {
        return this.f23404a.isLoggable(this.f23405b);
    }

    /* renamed from: l */
    private static String m13582l(C9978i c9978i) {
        EnumC9930b[] values;
        EnumMap enumMap = new EnumMap(EnumC9930b.class);
        for (EnumC9930b enumC9930b : EnumC9930b.values()) {
            if (c9978i.m13383d(enumC9930b.m13580a())) {
                enumMap.put((EnumMap) enumC9930b, (EnumC9930b) Integer.valueOf(c9978i.m13386a(enumC9930b.m13580a())));
            }
        }
        return enumMap.toString();
    }

    /* renamed from: m */
    private static String m13581m(C14342c c14342c) {
        if (c14342c.m2072F0() <= 64) {
            return c14342c.m2071H0().mo1959p();
        }
        int min = (int) Math.min(c14342c.m2072F0(), 64L);
        return c14342c.m2069J0(min).mo1959p() + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13592b(EnumC9929a enumC9929a, int i, C14342c c14342c, int i2, boolean z) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + m13581m(c14342c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m13591c(EnumC9929a enumC9929a, int i, EnumC9962a enumC9962a, C14347f c14347f) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            StringBuilder sb = new StringBuilder();
            sb.append(enumC9929a);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i);
            sb.append(" errorCode=");
            sb.append(enumC9962a);
            sb.append(" length=");
            sb.append(c14347f.mo1969A());
            sb.append(" bytes=");
            C14342c c14342c = new C14342c();
            c14342c.m2065P0(c14347f);
            sb.append(m13581m(c14342c));
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13590d(EnumC9929a enumC9929a, int i, List<C9966d> list, boolean z) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " HEADERS: streamId=" + i + " headers=" + list + " endStream=" + z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m13589e(EnumC9929a enumC9929a, long j) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " PING: ack=false bytes=" + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m13588f(EnumC9929a enumC9929a, long j) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " PING: ack=true bytes=" + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m13587g(EnumC9929a enumC9929a, int i, int i2, List<C9966d> list) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m13586h(EnumC9929a enumC9929a, int i, EnumC9962a enumC9962a) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " RST_STREAM: streamId=" + i + " errorCode=" + enumC9962a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m13585i(EnumC9929a enumC9929a, C9978i c9978i) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " SETTINGS: ack=false settings=" + m13582l(c9978i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m13584j(EnumC9929a enumC9929a) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m13583k(EnumC9929a enumC9929a, int i, long j) {
        if (m13593a()) {
            Logger logger = this.f23404a;
            Level level = this.f23405b;
            logger.log(level, enumC9929a + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }

    C9928i(Level level, Logger logger) {
        C5051n.m25779o(level, "level");
        this.f23405b = level;
        C5051n.m25779o(logger, "logger");
        this.f23404a = logger;
    }
}
