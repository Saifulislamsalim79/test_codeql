package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6628e;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.remoteconfig.C6772o;
import com.google.firebase.remoteconfig.InterfaceC6771n;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, InterfaceC6771n> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final Executor executor;
    private com.google.firebase.remoteconfig.k firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC6560b<C6772o> firebaseRemoteConfigProvider;
    private static final C6609a logger = C6609a.m21475e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private InterfaceC6771n getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            InterfaceC6771n interfaceC6771n = this.allRcConfigMap.get(str);
            if (interfaceC6771n.mo20799m() == 2) {
                logger.m21478b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", interfaceC6771n.mo20796p(), str);
                return interfaceC6771n;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        com.google.android.gms.tasks.j c = this.firebaseRemoteConfig.c();
        c.g(this.executor, new InterfaceC4458g() { // from class: com.google.firebase.perf.config.b
            @Override // com.google.android.gms.tasks.InterfaceC4458g
            /* renamed from: c */
            public final void mo18742c(Object obj) {
                RemoteConfigManager.this.m21627a((Boolean) obj);
            }
        });
        c.e(this.executor, new InterfaceC4456f() { // from class: com.google.firebase.perf.config.c
            @Override // com.google.android.gms.tasks.InterfaceC4456f
            /* renamed from: b */
            public final void mo15657b(Exception exc) {
                RemoteConfigManager.this.m21626b(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                syncConfigValues(this.firebaseRemoteConfig.d());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m21627a(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.d());
    }

    /* renamed from: b */
    public /* synthetic */ void m21626b(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    public C6628e<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.m21479a("The key to get Remote Config boolean value is null.");
            return C6628e.m21409a();
        }
        InterfaceC6771n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C6628e.m21405e(Boolean.valueOf(remoteConfigValue.mo20795q()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo20796p().isEmpty()) {
                    logger.m21478b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo20796p(), str);
                }
            }
        }
        return C6628e.m21409a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C6628e<Float> getFloat(String str) {
        if (str == null) {
            logger.m21479a("The key to get Remote Config float value is null.");
            return C6628e.m21409a();
        }
        InterfaceC6771n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C6628e.m21405e(Float.valueOf(Double.valueOf(remoteConfigValue.mo20797o()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo20796p().isEmpty()) {
                    logger.m21478b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo20796p(), str);
                }
            }
        }
        return C6628e.m21409a();
    }

    public C6628e<Long> getLong(String str) {
        if (str == null) {
            logger.m21479a("The key to get Remote Config long value is null.");
            return C6628e.m21409a();
        }
        InterfaceC6771n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C6628e.m21405e(Long.valueOf(remoteConfigValue.mo20798n()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo20796p().isEmpty()) {
                    logger.m21478b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo20796p(), str);
                }
            }
        }
        return C6628e.m21409a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        Object obj;
        InterfaceC6771n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t;
        }
        try {
            if (t instanceof Boolean) {
                obj = Boolean.valueOf(remoteConfigValue.mo20795q());
            } else if (t instanceof Float) {
                obj = Float.valueOf(Double.valueOf(remoteConfigValue.mo20797o()).floatValue());
            } else {
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        obj = remoteConfigValue.mo20796p();
                    } else {
                        T t2 = (T) remoteConfigValue.mo20796p();
                        try {
                            logger.m21478b("No matching type found for the defaultValue: '%s', using String.", t);
                            return t2;
                        } catch (IllegalArgumentException unused) {
                            t = t2;
                            if (remoteConfigValue.mo20796p().isEmpty()) {
                                return t;
                            }
                            logger.m21478b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo20796p(), str);
                            return t;
                        }
                    }
                }
                obj = Long.valueOf(remoteConfigValue.mo20798n());
            }
            return obj;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public C6628e<String> getString(String str) {
        if (str == null) {
            logger.m21479a("The key to get Remote Config String value is null.");
            return C6628e.m21409a();
        }
        InterfaceC6771n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return C6628e.m21405e(remoteConfigValue.mo20796p());
        }
        return C6628e.m21409a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC6560b<C6772o> interfaceC6560b;
        C6772o c6772o;
        if (this.firebaseRemoteConfig == null && (interfaceC6560b = this.firebaseRemoteConfigProvider) != null && (c6772o = interfaceC6560b.get()) != null) {
            this.firebaseRemoteConfig = c6772o.m20793b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.k kVar = this.firebaseRemoteConfig;
        return kVar == null || kVar.f().mo20800a() == 1;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC6560b<C6772o> interfaceC6560b) {
        this.firebaseRemoteConfigProvider = interfaceC6560b;
    }

    protected void syncConfigValues(Map<String, InterfaceC6771n> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
    }

    RemoteConfigManager(Executor executor, com.google.firebase.remoteconfig.k kVar) {
        this(executor, kVar, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS);
    }

    RemoteConfigManager(Executor executor, com.google.firebase.remoteconfig.k kVar, long j) {
        ConcurrentHashMap<String, InterfaceC6771n> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.executor = executor;
        this.firebaseRemoteConfig = kVar;
        if (kVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(kVar.d());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = TimeUnit.MICROSECONDS.toMillis(FirebasePerfProvider.getAppStartTime().m21399d());
        this.appStartConfigFetchDelayInMs = j;
    }
}
