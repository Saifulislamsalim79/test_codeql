package ai.kudi.mediaservice.marketplaceCollection;

import ai.kudi.mediaservice.marketplaceCollection.response.APIResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.UploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.utils.FileProgressRequestBody;
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
import retrofit2.C14840l;
import retrofit2.C14841m;
import retrofit2.adapter.rxjava2.C14800g;
import retrofit2.p605p.p606a.C14850a;
/* compiled from: FileStorageClient.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/FileStorageClient;", "", "api", "Lai/kudi/mediaservice/marketplaceCollection/API;", "(Lai/kudi/mediaservice/marketplaceCollection/API;)V", "marketplaceAPI", "getDefaultApi", "logInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "uploadFile", "Lio/reactivex/Observable;", "Lai/kudi/mediaservice/marketplaceCollection/response/UploadResponse;", "path", "", "progressCallback", "Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$UploadCallbacks;", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileStorageClient {
    private API marketplaceAPI;

    public FileStorageClient() {
        this(null, 1, null);
    }

    public FileStorageClient(API api) {
        this.marketplaceAPI = api == null ? getDefaultApi() : api;
    }

    private final API getDefaultApi() {
        C14239x.C14241b c14241b = new C14239x.C14241b();
        c14241b.m2424a(logInterceptor());
        C14239x m2423b = c14241b.m2423b();
        C6791g c6791g = new C6791g();
        c6791g.m20732c();
        C6784f m20733b = c6791g.m20733b();
        C14841m.C14843b c14843b = new C14841m.C14843b();
        c14843b.m263c("https://collection-dashboard-client.kudi.ai/collection-payout-service/");
        c14843b.m259g(m2423b);
        c14843b.m264b(C14850a.m220d(m20733b));
        c14843b.m265a(C14800g.m330d());
        Object m274d = c14843b.m261e().m274d(API.class);
        l.e(m274d, "Builder()\n            .baseUrl(BuildConfig.MARKETPLACE_MEDIA_BASE_URL)\n            .client(httpClient)\n            .addConverterFactory(GsonConverterFactory.create(gson))\n            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())\n            .build()\n            .create(API::class.java)");
        return (API) m274d;
    }

    private final C14207a logInterceptor() {
        C14207a.EnumC14208a enumC14208a = C14207a.EnumC14208a.NONE;
        C14207a c14207a = new C14207a();
        c14207a.m2627c(enumC14208a);
        return c14207a;
    }

    public static /* synthetic */ AbstractC11688p uploadFile$default(FileStorageClient fileStorageClient, String str, FileProgressRequestBody.UploadCallbacks uploadCallbacks, int i, Object obj) {
        if ((i & 2) != 0) {
            uploadCallbacks = null;
        }
        return fileStorageClient.uploadFile(str, uploadCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadFile$lambda-0  reason: not valid java name */
    public static final UploadResponse m41879uploadFile$lambda0(C14840l c14840l) {
        l.f(c14840l, "it");
        if (c14840l.m283b() == 200) {
            APIResponse aPIResponse = (APIResponse) c14840l.m284a();
            FileUploadResponse fileUploadResponse = aPIResponse == null ? null : (FileUploadResponse) aPIResponse.getData();
            l.d(fileUploadResponse);
            return new UploadResponse(fileUploadResponse, null, 2, null);
        }
        return new UploadResponse(null, "Error uploading file");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uploadFile$lambda-1  reason: not valid java name */
    public static final UploadResponse m41880uploadFile$lambda1(Throwable th) {
        l.f(th, "it");
        return new UploadResponse(null, th.getLocalizedMessage());
    }

    public final AbstractC11688p<UploadResponse> uploadFile(String str, FileProgressRequestBody.UploadCallbacks uploadCallbacks) {
        l.f(str, "path");
        File file = new File(str);
        C14236w.C14238b m2465b = C14236w.C14238b.m2465b("file", file.getName(), new FileProgressRequestBody(file, uploadCallbacks));
        API api = this.marketplaceAPI;
        l.e(m2465b, "part");
        AbstractC11688p<UploadResponse> m10526T = api.uploadFile(m2465b).m10531O(C0847a.f2354c).m10526T(C0848b.f2355c);
        l.e(m10526T, "marketplaceAPI.uploadFile(part).map {\n            if (it.code() == 200) UploadResponse(it.body()?.data!!) else UploadResponse(\n                null,\n                \"Error uploading file\"\n            )\n        }.onErrorReturn { UploadResponse(null, it.localizedMessage) }");
        return m10526T;
    }

    public /* synthetic */ FileStorageClient(API api, int i, g gVar) {
        this((i & 1) != 0 ? null : api);
    }
}
