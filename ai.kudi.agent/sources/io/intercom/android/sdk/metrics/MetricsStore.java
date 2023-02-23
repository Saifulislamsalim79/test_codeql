package io.intercom.android.sdk.metrics;

import android.content.Context;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.persistence.JsonStorage;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.IoUtils;
import io.intercom.com.google.gson.C10916e;
import io.intercom.retrofit2.Call;
import io.intercom.retrofit2.Callback;
import io.intercom.retrofit2.Response;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public class MetricsStore {
    private static final String METRICS_DIR = "intercomMetrics";
    private static final String OPS_METRICS_DIR = "intercomOpsMetrics";
    private static final int STORED_METRIC_LIMIT = 200;
    private static final int STORED_OP_METRIC_LIMIT = 100;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final JsonStorage.LoadFailureHandler deleteOnFailureHandler;
    private final Executor executor;
    private final String installerPackageName;
    private final boolean isDebugBuild;
    private final File metricsDir;
    private final File opsMetricsDir;
    private final JsonStorage storage;
    private final Twig twig;

    public MetricsStore(Context context, Provider<Api> provider, Provider<AppConfig> provider2) {
        this(provider, provider2, Executors.newSingleThreadExecutor(), new JsonStorage(new C10916e()), new File(context.getCacheDir(), METRICS_DIR), new File(context.getCacheDir(), OPS_METRICS_DIR), AppTypeDetector.isDebugBuild(context), AppTypeDetector.getInstallerPackageName(context), LumberMill.getLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void copyNonNullItems(List<T> list, List<T> list2) {
        for (T t : list) {
            if (t != null) {
                list2.add(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getFile(MetricObject metricObject) {
        File file = this.metricsDir;
        return new File(file, metricObject.getId() + ".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReachedMetricStorageLimit() {
        return this.storage.getDirectoryFileCount(this.metricsDir) > 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReachedOpsMetricStorageLimit() {
        return this.storage.getDirectoryFileCount(this.opsMetricsDir) > 100;
    }

    private boolean isDisabled() {
        return !this.appConfigProvider.get().isMetricsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadMetrics(final List<MetricObject> list, final List<OpsMetricObject> list2) {
        this.apiProvider.get().sendMetrics(list, list2, new Callback<Void>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.4
            @Override // io.intercom.retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th) {
            }

            @Override // io.intercom.retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful() || response.code() == 400) {
                    MetricsStore.this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C103044 c103044 = C103044.this;
                            MetricsStore.this.deleteFilesFor(list, list2);
                        }
                    });
                }
            }
        });
    }

    void deleteFilesFor(List<MetricObject> list, List<OpsMetricObject> list2) {
        for (MetricObject metricObject : list) {
            IoUtils.safelyDelete(getFile(metricObject));
        }
        for (OpsMetricObject opsMetricObject : list2) {
            IoUtils.safelyDelete(getFile(opsMetricObject));
        }
    }

    public void loadAndSendMetrics() {
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.3
            @Override // java.lang.Runnable
            public void run() {
                List<MetricObject> loadMetrics = MetricsStore.this.loadMetrics();
                List<OpsMetricObject> loadOpsMetrics = MetricsStore.this.loadOpsMetrics();
                if (loadMetrics.isEmpty() && loadOpsMetrics.isEmpty()) {
                    return;
                }
                MetricsStore.this.uploadMetrics(loadMetrics, loadOpsMetrics);
            }
        });
    }

    List<MetricObject> loadMetrics() {
        final ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.metricsDir, MetricObject.class, new JsonStorage.LoadHandler<List<MetricObject>>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.5
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(List<MetricObject> list) {
                MetricsStore.copyNonNullItems(list, arrayList);
            }
        }, this.deleteOnFailureHandler);
        return arrayList;
    }

    List<OpsMetricObject> loadOpsMetrics() {
        final ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.opsMetricsDir, OpsMetricObject.class, new JsonStorage.LoadHandler<List<OpsMetricObject>>() { // from class: io.intercom.android.sdk.metrics.MetricsStore.6
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
            public void onLoad(List<OpsMetricObject> list) {
                MetricsStore.copyNonNullItems(list, arrayList);
            }
        }, this.deleteOnFailureHandler);
        return arrayList;
    }

    public void track(final MetricObject metricObject) {
        if (isDisabled()) {
            return;
        }
        metricObject.addInstallerPackageName(this.installerPackageName).addIsDebugBuild(this.isDebugBuild);
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.1
            @Override // java.lang.Runnable
            public void run() {
                if (MetricsStore.this.hasReachedMetricStorageLimit()) {
                    return;
                }
                JsonStorage jsonStorage = MetricsStore.this.storage;
                MetricObject metricObject2 = metricObject;
                jsonStorage.saveToFileAsJson(metricObject2, MetricsStore.this.getFile(metricObject2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getFile(OpsMetricObject opsMetricObject) {
        File file = this.opsMetricsDir;
        return new File(file, opsMetricObject.getId() + ".json");
    }

    public void track(final OpsMetricObject opsMetricObject) {
        if (isDisabled()) {
            return;
        }
        this.executor.execute(new Runnable() { // from class: io.intercom.android.sdk.metrics.MetricsStore.2
            @Override // java.lang.Runnable
            public void run() {
                if (MetricsStore.this.hasReachedOpsMetricStorageLimit()) {
                    return;
                }
                JsonStorage jsonStorage = MetricsStore.this.storage;
                OpsMetricObject opsMetricObject2 = opsMetricObject;
                jsonStorage.saveToFileAsJson(opsMetricObject2, MetricsStore.this.getFile(opsMetricObject2));
            }
        });
    }

    MetricsStore(Provider<Api> provider, Provider<AppConfig> provider2, Executor executor, JsonStorage jsonStorage, File file, File file2, boolean z, String str, Twig twig) {
        this.deleteOnFailureHandler = new JsonStorage.LoadFailureHandler() { // from class: io.intercom.android.sdk.metrics.MetricsStore.7
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
            public void onLoadFailed(File file3, Exception exc) {
                IoUtils.safelyDelete(file3);
                Twig twig2 = MetricsStore.this.twig;
                twig2.m13060v(exc, "Couldn't load file " + file3.getAbsolutePath(), new Object[0]);
            }
        };
        this.apiProvider = provider;
        this.appConfigProvider = provider2;
        this.executor = executor;
        this.storage = jsonStorage;
        this.metricsDir = file;
        this.opsMetricsDir = file2;
        this.isDebugBuild = z;
        this.installerPackageName = str;
        this.twig = twig;
    }
}
