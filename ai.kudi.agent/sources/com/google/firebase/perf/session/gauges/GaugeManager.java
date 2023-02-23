package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p179k.C6657f;
import com.google.firebase.perf.p179k.C6660g;
import com.google.firebase.perf.p179k.EnumC6652d;
import com.google.firebase.perf.session.C6710a;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC6652d applicationProcessState;
    private final C6569d configResolver;
    private final C6720g cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final ScheduledExecutorService gaugeManagerExecutor;
    private C6721h gaugeMetadataManager;
    private final C6722i memoryGaugeCollector;
    private String sessionId;
    private final C6623k transportManager;
    private static final C6609a logger = C6609a.m21475e();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6713a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16143a;

        static {
            int[] iArr = new int[EnumC6652d.values().length];
            f16143a = iArr;
            try {
                iArr[EnumC6652d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16143a[EnumC6652d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private GaugeManager() {
        this(Executors.newSingleThreadScheduledExecutor(), C6623k.m21437e(), C6569d.m21605f(), null, C6720g.m20971d(), C6722i.m20954c());
    }

    private long getCpuGaugeCollectionFrequencyMs(EnumC6652d enumC6652d) {
        long m21588w;
        int i = C6713a.f16143a[enumC6652d.ordinal()];
        if (i != 1) {
            m21588w = i != 2 ? -1L : this.configResolver.m21587x();
        } else {
            m21588w = this.configResolver.m21588w();
        }
        if (C6720g.m20970e(m21588w)) {
            return -1L;
        }
        return m21588w;
    }

    private C6657f getGaugeMetadata() {
        C6657f.C6659b m21321Y = C6657f.m21321Y();
        m21321Y.m21313I(this.gaugeMetadataManager.m20958e());
        m21321Y.m21316F(this.gaugeMetadataManager.m20961b());
        m21321Y.m21315G(this.gaugeMetadataManager.m20960c());
        m21321Y.m21314H(this.gaugeMetadataManager.m20959d());
        return m21321Y.build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC6652d enumC6652d) {
        long m21585z;
        int i = C6713a.f16143a[enumC6652d.ordinal()];
        if (i != 1) {
            m21585z = i != 2 ? -1L : this.configResolver.m21625A();
        } else {
            m21585z = this.configResolver.m21585z();
        }
        if (C6722i.m20953d(m21585z)) {
            return -1L;
        }
        return m21585z;
    }

    private boolean startCollectingCpuMetrics(long j, C6637h c6637h) {
        if (j == -1) {
            logger.m21479a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.m20965j(j, c6637h);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, C6637h c6637h) {
        if (j == -1) {
            logger.m21479a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.m20948i(j, c6637h);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void m20975b(String str, EnumC6652d enumC6652d) {
        C6660g.C6662b m21297g0 = C6660g.m21297g0();
        while (!this.cpuGaugeCollector.f16161a.isEmpty()) {
            m21297g0.m21293G(this.cpuGaugeCollector.f16161a.poll());
        }
        while (!this.memoryGaugeCollector.f16176b.isEmpty()) {
            m21297g0.m21294F(this.memoryGaugeCollector.f16176b.poll());
        }
        m21297g0.m21291I(str);
        this.transportManager.m21420v(m21297g0.build(), enumC6652d);
    }

    public void collectGaugeMetricOnce(C6637h c6637h) {
        collectGaugeMetricOnce(this.cpuGaugeCollector, this.memoryGaugeCollector, c6637h);
    }

    public boolean logGaugeMetadata(String str, EnumC6652d enumC6652d) {
        if (this.gaugeMetadataManager != null) {
            C6660g.C6662b m21297g0 = C6660g.m21297g0();
            m21297g0.m21291I(str);
            m21297g0.m21292H(getGaugeMetadata());
            this.transportManager.m21420v(m21297g0.build(), enumC6652d);
            return true;
        }
        return false;
    }

    public void setApplicationContext(Context context) {
        this.gaugeMetadataManager = new C6721h(context);
    }

    public void startCollectingGauges(C6710a c6710a, final EnumC6652d enumC6652d) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(enumC6652d, c6710a.m20986d());
        if (startCollectingGauges == -1) {
            logger.m21471i("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String m20982h = c6710a.m20982h();
        this.sessionId = m20982h;
        this.applicationProcessState = enumC6652d;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.c
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.m20976a(m20982h, enumC6652d);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6609a c6609a = logger;
            c6609a.m21471i("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final EnumC6652d enumC6652d = this.applicationProcessState;
        this.cpuGaugeCollector.m20964k();
        this.memoryGaugeCollector.m20947j();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.m20975b(str, enumC6652d);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC6652d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(C6720g c6720g, C6722i c6722i, C6637h c6637h) {
        c6720g.m20974a(c6637h);
        c6722i.m20956a(c6637h);
    }

    GaugeManager(ScheduledExecutorService scheduledExecutorService, C6623k c6623k, C6569d c6569d, C6721h c6721h, C6720g c6720g, C6722i c6722i) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC6652d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = scheduledExecutorService;
        this.transportManager = c6623k;
        this.configResolver = c6569d;
        this.gaugeMetadataManager = c6721h;
        this.cpuGaugeCollector = c6720g;
        this.memoryGaugeCollector = c6722i;
    }

    private long startCollectingGauges(EnumC6652d enumC6652d, C6637h c6637h) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC6652d);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, c6637h)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC6652d);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, c6637h) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
