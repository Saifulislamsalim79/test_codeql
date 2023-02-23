package ai.kudi.agent.network.mods;

import ai.kudi.agent.network.ConnectionCheckInterceptor;
import android.content.Context;
import com.google.gson.C6784f;
import com.google.gson.C6791g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p565l.C14239x;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
import retrofit2.adapter.rxjava2.C14800g;
import retrofit2.p605p.p606a.C14850a;
/* compiled from: ServiceModule.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/network/di/ServiceModule;", "", "()V", "providesRetrofit", "Lretrofit2/Retrofit;", "context", "Landroid/content/Context;", "providesAuthInterceptor", "Lokhttp3/Interceptor;", "providesVersionInterceptor", "providesLoginInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "Companion", "network_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ServiceModule {
    public static final String APP_BASE_URL = "https://app-service.kudi.ai/";
    public static final Companion Companion;

    /* compiled from: ServiceModule.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/network/di/ServiceModule$Companion;", "", "()V", "APP_BASE_URL", "", "network_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14841m providesRetrofit(Context context, InterfaceC14233u interfaceC14233u, InterfaceC14233u interfaceC14233u2, C14207a c14207a) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(interfaceC14233u, "providesAuthInterceptor");
        Log_OC.getArray(interfaceC14233u2, "providesVersionInterceptor");
        Log_OC.getArray(c14207a, "providesLoginInterceptor");
        C14239x.C14241b r15 = new C14239x.C14241b();
        C14207a r19 = c14207a;
        r15.m2424a(r19);
        ConnectionCheckInterceptor r16 = new ConnectionCheckInterceptor(context);
        r15.m2424a(r16);
        r15.m2424a(interfaceC14233u);
        r15.m2424a(interfaceC14233u2);
        TimeUnit $r7 = TimeUnit.SECONDS;
        r15.m2421d(300L, $r7);
        TimeUnit $r72 = TimeUnit.SECONDS;
        r15.m2420e(30L, $r72);
        TimeUnit $r73 = TimeUnit.SECONDS;
        r15.m2419f(15L, $r73);
        C14239x $r8 = r15.m2423b();
        C6791g r17 = new C6791g();
        r17.m20732c();
        C6784f $r10 = r17.m20733b();
        C14841m.C14843b r18 = new C14841m.C14843b();
        r18.m263c("https://app-service.kudi.ai/");
        r18.m259g($r8);
        C14850a $r12 = C14850a.m220d($r10);
        r18.m264b($r12);
        C14800g $r13 = C14800g.m330d();
        r18.m265a($r13);
        C14841m $r14 = r18.m261e();
        Log_OC.loadImage($r14, "Builder()\n            .baseUrl(APP_BASE_URL)\n            .client(httpClient)\n            .addConverterFactory(GsonConverterFactory.create(gson))\n            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())\n            .build()");
        return $r14;
    }
}
