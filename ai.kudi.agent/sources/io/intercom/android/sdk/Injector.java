package io.intercom.android.sdk;

import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import android.app.Application;
import android.app.NotificationManager;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.api.UserUpdateBatcher;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.SoundPlayer;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.exceptions.IntercomIntegrationException;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.store.StoreFactory;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.google.gson.C10916e;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import p425j.p429b.p430a.p431a.p432a.C11129b;
import p425j.p429b.p430a.p431a.p432a.InterfaceC11138i;
/* loaded from: classes2.dex */
public class Injector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;
    private static final Twig TWIG = LumberMill.getLogger();
    private static Injector instance;
    private Api api;
    private final AppConfig appConfig;
    private final AppIdentity appIdentity;
    private final Application application;
    private MainThreadBus bus;
    private ErrorReporter errorReporter;
    private C10916e gson;
    private LifecycleTracker lifecycleTracker;
    private MetricTracker metricTracker;
    private MetricsStore metricsStore;
    private NexusWrapper nexusClient;
    private OpsMetricTracker opsMetricTracker;
    private OverlayPresenter overlayPresenter;
    private ResetManager resetManager;
    private Store<State> store;
    private DeDuper superDeDuper;
    private SystemNotificationManager systemNotificationManager;
    private final UserIdentity userIdentity;
    private UserUpdateBatcher userUpdateBatcher;
    private final ActivityFinisher activityFinisher = new ActivityFinisher();
    private final Provider<AppConfig> appConfigProvider = new Provider<AppConfig>() { // from class: io.intercom.android.sdk.Injector.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public AppConfig get() {
            return Injector.this.appConfig;
        }
    };
    private final Provider<NexusClient> nexusClientProvider = new Provider<NexusClient>() { // from class: io.intercom.android.sdk.Injector.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public NexusClient get() {
            return Injector.this.getNexusClient();
        }
    };
    private final Provider<UserUpdateBatcher> userUpdateBatcherProvider = new Provider<UserUpdateBatcher>() { // from class: io.intercom.android.sdk.Injector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public UserUpdateBatcher get() {
            return Injector.this.getUserUpdateBatcher();
        }
    };
    private final Provider<Api> apiProvider = new Provider<Api>() { // from class: io.intercom.android.sdk.Injector.4
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public Api get() {
            return Injector.this.getApi();
        }
    };
    private final Provider<OverlayPresenter> overlayManagerProvider = new Provider<OverlayPresenter>() { // from class: io.intercom.android.sdk.Injector.5
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public OverlayPresenter get() {
            return Injector.this.getOverlayPresenter();
        }
    };
    private final Provider<UserIdentity> userIdentityProvider = new Provider<UserIdentity>() { // from class: io.intercom.android.sdk.Injector.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public UserIdentity get() {
            return Injector.this.getUserIdentity();
        }
    };
    private final Provider<MetricTracker> metricTrackerProvider = new Provider<MetricTracker>() { // from class: io.intercom.android.sdk.Injector.7
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public MetricTracker get() {
            return Injector.this.getMetricTracker();
        }
    };

    protected Injector(Application application, AppIdentity appIdentity, AppConfig appConfig, UserIdentity userIdentity) {
        this.application = application;
        this.appIdentity = appIdentity;
        this.appConfig = appConfig;
        this.userIdentity = userIdentity;
    }

    public static synchronized Injector get() {
        Injector injector;
        synchronized (Injector.class) {
            if (instance != null) {
                injector = instance;
            } else {
                throw new IntercomIntegrationException("Intercom was not initialized correctly, Intercom.initialize() needs to be called in onCreate() in your Application class.");
            }
        }
        return injector;
    }

    public static synchronized void initIfCachedCredentials(Application application) {
        synchronized (Injector.class) {
            if (instance != null) {
                return;
            }
            AppIdentity loadFromDevice = AppIdentity.loadFromDevice(application);
            String apiKey = loadFromDevice.apiKey();
            String appId = loadFromDevice.appId();
            if (!appId.isEmpty() && !apiKey.isEmpty()) {
                initWithAppCredentials(application, apiKey, appId);
            }
        }
    }

    public static synchronized void initWithAppCredentials(Application application, String str, String str2) {
        synchronized (Injector.class) {
            if (instance != null) {
                return;
            }
            TWIG.internal("Injector", "Initializing");
            AppIdentity create = AppIdentity.create(str, str2);
            create.persist(application);
            Injector injector = new Injector(application, create, new AppConfig(application), new UserIdentity(application));
            instance = injector;
            application.registerActivityLifecycleCallbacks(injector.getLifecycleTracker());
        }
    }

    public static synchronized boolean isNotInitialised() {
        boolean z;
        synchronized (Injector.class) {
            z = instance == null;
        }
        return z;
    }

    static void setSharedInstance(Injector injector) {
        instance = injector;
    }

    public ActivityFinisher getActivityFinisher() {
        return this.activityFinisher;
    }

    public synchronized Api getApi() {
        if (this.api == null) {
            this.api = ApiFactory.create(getApplication(), this.appIdentity, this.userIdentity, getBus(), getStore(), ApiFactory.getHostname(this.appIdentity), this.appConfigProvider, getGson());
        }
        this.api.updateMaxRequests();
        return this.api;
    }

    public Provider<Api> getApiProvider() {
        return this.apiProvider;
    }

    public Provider<AppConfig> getAppConfigProvider() {
        return this.appConfigProvider;
    }

    public AppIdentity getAppIdentity() {
        return this.appIdentity;
    }

    public Application getApplication() {
        return this.application;
    }

    public synchronized C11129b getBus() {
        if (this.bus == null) {
            this.bus = new MainThreadBus(InterfaceC11138i.f25197a);
        }
        return this.bus;
    }

    public synchronized DeDuper getDeDuper() {
        if (this.superDeDuper == null) {
            DeDuper deDuper = new DeDuper(this.appConfigProvider, this.application.getSharedPreferences(PreferenceKeys.INTERCOM_DEDUPER_PREFS, 0));
            this.superDeDuper = deDuper;
            deDuper.readPersistedCachedAttributes();
        }
        return this.superDeDuper;
    }

    public synchronized ErrorReporter getErrorReporter() {
        if (this.errorReporter == null) {
            this.errorReporter = ErrorReporter.create(this.application, getGson(), this.apiProvider);
        }
        return this.errorReporter;
    }

    public synchronized C10916e getGson() {
        if (this.gson == null) {
            this.gson = new C10916e();
        }
        return this.gson;
    }

    public synchronized LifecycleTracker getLifecycleTracker() {
        if (this.lifecycleTracker == null) {
            this.lifecycleTracker = LifecycleTracker.create(getSystemNotificationManager(), getMetricsStore(), getErrorReporter(), getDeDuper(), getTimeProvider(), getUserUpdateBatcher(), getStore(), getResetManager(), SystemSettings.getTransitionScale(this.application));
        }
        return this.lifecycleTracker;
    }

    public synchronized MetricTracker getMetricTracker() {
        if (this.metricTracker == null) {
            this.metricTracker = new MetricTracker(this.userIdentity, getMetricsStore(), getApplication());
        }
        return this.metricTracker;
    }

    public synchronized MetricsStore getMetricsStore() {
        if (this.metricsStore == null) {
            this.metricsStore = new MetricsStore(getApplication(), getApiProvider(), this.appConfigProvider);
        }
        return this.metricsStore;
    }

    public synchronized NexusClient getNexusClient() {
        if (this.nexusClient == null) {
            this.nexusClient = new NexusWrapper(LumberMill.getNexusTwig(), NexusClient.defaultOkHttpClientBuilder().socketFactory(new TaggingSocketFactory(SocketFactory.getDefault(), (int) NEXUS_TRAFFIC_TAG)).build(), getBus(), getStore(), getNexusDebouncePeriod());
        }
        return this.nexusClient;
    }

    protected long getNexusDebouncePeriod() {
        return TimeUnit.SECONDS.toMillis(1L);
    }

    public synchronized OpsMetricTracker getOpsMetricTracker() {
        if (this.opsMetricTracker == null) {
            this.opsMetricTracker = new OpsMetricTracker(getMetricsStore(), getTimeProvider(), UuidStringProvider.SYSTEM);
        }
        return this.opsMetricTracker;
    }

    public synchronized OverlayPresenter getOverlayPresenter() {
        if (this.overlayPresenter == null) {
            this.overlayPresenter = new OverlayPresenter(getApplication(), getBus(), getStore(), this.appConfigProvider, getMetricTracker(), this.userIdentity, ComponentCallbacks2C10478c.m13018s(this.application));
        }
        return this.overlayPresenter;
    }

    public synchronized ResetManager getResetManager() {
        if (this.resetManager == null) {
            this.resetManager = new ResetManager(getApiProvider(), getUserIdentity(), getOverlayPresenter(), this.appConfigProvider, getStore(), getUserUpdateBatcher(), this.application, this.activityFinisher);
        }
        return this.resetManager;
    }

    public synchronized Store<State> getStore() {
        if (this.store == null) {
            this.store = StoreFactory.createStore(this.apiProvider, this.appConfigProvider, this.nexusClientProvider, this.overlayManagerProvider, this.userUpdateBatcherProvider, new SoundPlayer(this.application, this.appConfigProvider), this.userIdentityProvider, this.application, LumberMill.getLogger(), getBus(), this.metricTrackerProvider);
        }
        return this.store;
    }

    public synchronized SystemNotificationManager getSystemNotificationManager() {
        if (this.systemNotificationManager == null) {
            this.systemNotificationManager = new SystemNotificationManager((NotificationManager) this.application.getSystemService(IncomingMessage.TYPE_NOTIFICATION));
        }
        return this.systemNotificationManager;
    }

    public TimeProvider getTimeProvider() {
        return TimeProvider.SYSTEM;
    }

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public synchronized UserUpdateBatcher getUserUpdateBatcher() {
        if (this.userUpdateBatcher == null) {
            this.userUpdateBatcher = UserUpdateBatcher.create(getApiProvider(), this.appConfigProvider, getStore());
        }
        return this.userUpdateBatcher;
    }

    public Provider<UserUpdateBatcher> getUserUpdateBatcherProvider() {
        return this.userUpdateBatcherProvider;
    }
}
