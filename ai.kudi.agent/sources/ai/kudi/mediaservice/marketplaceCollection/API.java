package ai.kudi.mediaservice.marketplaceCollection;

import ai.kudi.mediaservice.marketplaceCollection.response.APIResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p565l.C14236w;
import retrofit2.C14840l;
import retrofit2.q.k;
import retrofit2.q.n;
import retrofit2.q.p;
/* compiled from: API.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/API;", "", "uploadFile", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lai/kudi/mediaservice/marketplaceCollection/response/APIResponse;", "Lai/kudi/mediaservice/marketplaceCollection/response/FileUploadResponse;", "file", "Lokhttp3/MultipartBody$Part;", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface API {
    @k
    @n("file-storage/file")
    AbstractC11688p<C14840l<APIResponse<FileUploadResponse>>> uploadFile(@p C14236w.C14238b c14238b);
}
