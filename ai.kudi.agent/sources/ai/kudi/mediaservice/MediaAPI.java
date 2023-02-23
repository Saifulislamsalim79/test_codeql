package ai.kudi.mediaservice;

import ai.kudi.mediaservice.dto.MediaUploadResponse;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p565l.C14236w;
import retrofit2.q.k;
import retrofit2.q.n;
import retrofit2.q.p;
/* compiled from: MediaAPI.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/mediaservice/MediaAPI;", "", "postImage", "Lio/reactivex/Observable;", "Lai/kudi/mediaservice/dto/MediaUploadResponse;", "file", "Lokhttp3/MultipartBody$Part;", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface MediaAPI {
    @k
    @n("/images")
    AbstractC11688p<MediaUploadResponse> postImage(@p C14236w.C14238b c14238b);
}
