package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ub */
/* loaded from: classes2.dex */
public final class C4023ub implements InterfaceC4007tb {

    /* renamed from: A */
    public static final AbstractC3892m6<Long> f9747A;

    /* renamed from: B */
    public static final AbstractC3892m6<Long> f9748B;

    /* renamed from: C */
    public static final AbstractC3892m6<Long> f9749C;

    /* renamed from: D */
    public static final AbstractC3892m6<Long> f9750D;

    /* renamed from: E */
    public static final AbstractC3892m6<Long> f9751E;

    /* renamed from: F */
    public static final AbstractC3892m6<Long> f9752F;

    /* renamed from: G */
    public static final AbstractC3892m6<Long> f9753G;

    /* renamed from: H */
    public static final AbstractC3892m6<String> f9754H;

    /* renamed from: I */
    public static final AbstractC3892m6<Long> f9755I;

    /* renamed from: a */
    public static final AbstractC3892m6<Long> f9756a;

    /* renamed from: b */
    public static final AbstractC3892m6<Long> f9757b;

    /* renamed from: c */
    public static final AbstractC3892m6<Long> f9758c;

    /* renamed from: d */
    public static final AbstractC3892m6<String> f9759d;

    /* renamed from: e */
    public static final AbstractC3892m6<String> f9760e;

    /* renamed from: f */
    public static final AbstractC3892m6<Long> f9761f;

    /* renamed from: g */
    public static final AbstractC3892m6<Long> f9762g;

    /* renamed from: h */
    public static final AbstractC3892m6<Long> f9763h;

    /* renamed from: i */
    public static final AbstractC3892m6<Long> f9764i;

    /* renamed from: j */
    public static final AbstractC3892m6<Long> f9765j;

    /* renamed from: k */
    public static final AbstractC3892m6<Long> f9766k;

    /* renamed from: l */
    public static final AbstractC3892m6<Long> f9767l;

    /* renamed from: m */
    public static final AbstractC3892m6<Long> f9768m;

    /* renamed from: n */
    public static final AbstractC3892m6<Long> f9769n;

    /* renamed from: o */
    public static final AbstractC3892m6<Long> f9770o;

    /* renamed from: p */
    public static final AbstractC3892m6<Long> f9771p;

    /* renamed from: q */
    public static final AbstractC3892m6<Long> f9772q;

    /* renamed from: r */
    public static final AbstractC3892m6<Long> f9773r;

    /* renamed from: s */
    public static final AbstractC3892m6<Long> f9774s;

    /* renamed from: t */
    public static final AbstractC3892m6<Long> f9775t;

    /* renamed from: u */
    public static final AbstractC3892m6<Long> f9776u;

    /* renamed from: v */
    public static final AbstractC3892m6<Long> f9777v;

    /* renamed from: w */
    public static final AbstractC3892m6<Long> f9778w;

    /* renamed from: x */
    public static final AbstractC3892m6<Long> f9779x;

    /* renamed from: y */
    public static final AbstractC3892m6<Long> f9780y;

    /* renamed from: z */
    public static final AbstractC3892m6<Long> f9781z;

    static {
        C3845j6 c3845j6 = new C3845j6(C3736c6.m29716a("com.google.android.gms.measurement"));
        f9756a = c3845j6.m29460c("measurement.ad_id_cache_time", 10000L);
        f9757b = c3845j6.m29460c("measurement.max_bundles_per_iteration", 100L);
        f9758c = c3845j6.m29460c("measurement.config.cache_time", 86400000L);
        c3845j6.m29459d("measurement.log_tag", "FA");
        f9759d = c3845j6.m29459d("measurement.config.url_authority", "app-measurement.com");
        f9760e = c3845j6.m29459d("measurement.config.url_scheme", "https");
        f9761f = c3845j6.m29460c("measurement.upload.debug_upload_interval", 1000L);
        f9762g = c3845j6.m29460c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f9763h = c3845j6.m29460c("measurement.store.max_stored_events_per_app", 100000L);
        f9764i = c3845j6.m29460c("measurement.experiment.max_ids", 50L);
        f9765j = c3845j6.m29460c("measurement.audience.filter_result_max_count", 200L);
        f9766k = c3845j6.m29460c("measurement.alarm_manager.minimum_interval", 60000L);
        f9767l = c3845j6.m29460c("measurement.upload.minimum_delay", 500L);
        f9768m = c3845j6.m29460c("measurement.monitoring.sample_period_millis", 86400000L);
        f9769n = c3845j6.m29460c("measurement.upload.realtime_upload_interval", 10000L);
        f9770o = c3845j6.m29460c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        c3845j6.m29460c("measurement.config.cache_time.service", 3600000L);
        f9771p = c3845j6.m29460c("measurement.service_client.idle_disconnect_millis", 5000L);
        c3845j6.m29459d("measurement.log_tag.service", "FA-SVC");
        f9772q = c3845j6.m29460c("measurement.upload.stale_data_deletion_interval", 86400000L);
        f9773r = c3845j6.m29460c("measurement.sdk.attribution.cache.ttl", 604800000L);
        f9774s = c3845j6.m29460c("measurement.upload.backoff_period", 43200000L);
        f9775t = c3845j6.m29460c("measurement.upload.initial_upload_delay_time", 15000L);
        f9776u = c3845j6.m29460c("measurement.upload.interval", 3600000L);
        f9777v = c3845j6.m29460c("measurement.upload.max_bundle_size", 65536L);
        f9778w = c3845j6.m29460c("measurement.upload.max_bundles", 100L);
        f9779x = c3845j6.m29460c("measurement.upload.max_conversions_per_day", 500L);
        f9780y = c3845j6.m29460c("measurement.upload.max_error_events_per_day", 1000L);
        f9781z = c3845j6.m29460c("measurement.upload.max_events_per_bundle", 1000L);
        f9747A = c3845j6.m29460c("measurement.upload.max_events_per_day", 100000L);
        f9748B = c3845j6.m29460c("measurement.upload.max_public_events_per_day", 50000L);
        f9749C = c3845j6.m29460c("measurement.upload.max_queue_time", 2419200000L);
        f9750D = c3845j6.m29460c("measurement.upload.max_realtime_events_per_day", 10L);
        f9751E = c3845j6.m29460c("measurement.upload.max_batch_size", 65536L);
        f9752F = c3845j6.m29460c("measurement.upload.retry_count", 6L);
        f9753G = c3845j6.m29460c("measurement.upload.retry_time", 1800000L);
        f9754H = c3845j6.m29459d("measurement.upload.url", "https://app-measurement.com/a");
        f9755I = c3845j6.m29460c("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: A */
    public final long mo28845A() {
        return f9780y.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: B */
    public final long mo28844B() {
        return f9752F.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: C */
    public final long mo28843C() {
        return f9753G.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: D */
    public final long mo28842D() {
        return f9781z.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: E */
    public final long mo28841E() {
        return f9779x.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: F */
    public final String mo28840F() {
        return f9760e.m29400b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: G */
    public final long mo28839G() {
        return f9749C.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: a */
    public final long mo28838a() {
        return f9762g.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: b */
    public final long mo28837b() {
        return f9765j.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: c */
    public final long mo28836c() {
        return f9758c.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: d */
    public final long mo28835d() {
        return f9761f.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: e */
    public final long mo28834e() {
        return f9774s.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: f */
    public final long mo28833f() {
        return f9764i.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: g */
    public final long mo28832g() {
        return f9773r.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: h */
    public final long mo28831h() {
        return f9766k.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: i */
    public final long mo28830i() {
        return f9771p.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: j */
    public final long mo28829j() {
        return f9763h.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: k */
    public final long mo28828k() {
        return f9772q.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: l */
    public final long mo28827l() {
        return f9769n.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: m */
    public final long mo28826m() {
        return f9770o.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: n */
    public final long mo28825n() {
        return f9767l.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: o */
    public final long mo28824o() {
        return f9768m.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: p */
    public final long mo28823p() {
        return f9775t.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: q */
    public final long mo28822q() {
        return f9750D.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: r */
    public final long mo28821r() {
        return f9778w.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: s */
    public final long mo28820s() {
        return f9751E.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: t */
    public final long mo28819t() {
        return f9776u.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: u */
    public final String mo28818u() {
        return f9754H.m29400b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: v */
    public final long mo28817v() {
        return f9777v.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: w */
    public final long mo28816w() {
        return f9755I.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: x */
    public final long mo28815x() {
        return f9747A.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: y */
    public final long mo28814y() {
        return f9748B.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    /* renamed from: z */
    public final String mo28813z() {
        return f9759d.m29400b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    public final long zza() {
        return f9756a.m29400b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4007tb
    public final long zzb() {
        return f9757b.m29400b().longValue();
    }
}
