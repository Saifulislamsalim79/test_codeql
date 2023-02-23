package ai.kudi.mediaservice;

import ai.kudi.mediaservice.dto.MediaUploadResponse;
import ai.kudi.mediaservice.utils.ProgressRequestBody;
import com.google.gson.C6784f;
import com.google.gson.C6791g;
import java.io.File;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import p425j.p444e.AbstractC11688p;
import p565l.C14236w;
import p565l.C14239x;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
import retrofit2.adapter.rxjava2.C14800g;
import retrofit2.p605p.p606a.C14850a;
/* compiled from: DrakeClient.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/mediaservice/DrakeClient;", "", "mediaAPI", "Lai/kudi/mediaservice/MediaAPI;", "(Lai/kudi/mediaservice/MediaAPI;)V", "getDefaultApi", "logInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "uploadImage", "Lio/reactivex/Observable;", "Lai/kudi/mediaservice/dto/MediaUploadResponse;", "imagePath", "", "progressCallback", "Lai/kudi/mediaservice/utils/ProgressRequestBody$UploadCallbacks;", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DrakeClient {
    private MediaAPI mediaAPI;

    public DrakeClient() {
        this(null, 1, null);
    }

    public DrakeClient(MediaAPI mediaAPI) {
        this.mediaAPI = mediaAPI == null ? getDefaultApi() : mediaAPI;
    }

    private final MediaAPI getDefaultApi() {
        C14239x.C14241b c14241b = new C14239x.C14241b();
        c14241b.m2424a(logInterceptor());
        C14239x m2423b = c14241b.m2423b();
        C6791g c6791g = new C6791g();
        c6791g.m20732c();
        C6784f m20733b = c6791g.m20733b();
        C14841m.C14843b c14843b = new C14841m.C14843b();
        c14843b.m263c("https://app-service.kudi.ai/");
        c14843b.m259g(m2423b);
        c14843b.m264b(C14850a.m220d(m20733b));
        c14843b.m265a(C14800g.m330d());
        Object m274d = c14843b.m261e().m274d(MediaAPI.class);
        l.e(m274d, "Builder()\n            .baseUrl(BuildConfig.MEDIA_BASE_URL)\n            .client(httpClient)\n            .addConverterFactory(GsonConverterFactory.create(gson))\n            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())\n            .build()\n            .create(MediaAPI::class.java)");
        return (MediaAPI) m274d;
    }

    private final C14207a logInterceptor() {
        C14207a.EnumC14208a enumC14208a = C14207a.EnumC14208a.NONE;
        C14207a c14207a = new C14207a();
        c14207a.m2627c(enumC14208a);
        return c14207a;
    }

    public static /* synthetic */ AbstractC11688p uploadImage$default(DrakeClient drakeClient, String str, ProgressRequestBody.UploadCallbacks uploadCallbacks, int i, Object obj) {
        if ((i & 2) != 0) {
            uploadCallbacks = null;
        }
        return drakeClient.uploadImage(str, uploadCallbacks);
    }

    public final AbstractC11688p<MediaUploadResponse> uploadImage(String str, ProgressRequestBody.UploadCallbacks uploadCallbacks) {
        l.f(str, "imagePath");
        File file = new File(str);
        C14236w.C14238b m2465b = C14236w.C14238b.m2465b("file", file.getName(), new ProgressRequestBody(file, uploadCallbacks));
        MediaAPI mediaAPI = this.mediaAPI;
        l.e(m2465b, "part");
        return mediaAPI.postImage(m2465b);
    }

    public /* synthetic */ DrakeClient(MediaAPI mediaAPI, int i, g gVar) {
        this((i & 1) != 0 ? null : mediaAPI);
    }
}
