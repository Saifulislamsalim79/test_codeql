package ai.kudi.mediaservice.marketplaceCollection.response;

import kotlin.Metadata;
import kotlin.e0.d.l;
/* compiled from: FileUploadResponse.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/response/FileUploadResponse;", "", "id", "", "uri", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUri", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileUploadResponse {

    /* renamed from: id */
    private final String f2356id;
    private final String uri;

    public FileUploadResponse(String str, String str2) {
        l.f(str, "id");
        l.f(str2, "uri");
        this.f2356id = str;
        this.uri = str2;
    }

    public static /* synthetic */ FileUploadResponse copy$default(FileUploadResponse fileUploadResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUploadResponse.f2356id;
        }
        if ((i & 2) != 0) {
            str2 = fileUploadResponse.uri;
        }
        return fileUploadResponse.copy(str, str2);
    }

    public final String component1() {
        return this.f2356id;
    }

    public final String component2() {
        return this.uri;
    }

    public final FileUploadResponse copy(String str, String str2) {
        l.f(str, "id");
        l.f(str2, "uri");
        return new FileUploadResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileUploadResponse) {
            FileUploadResponse fileUploadResponse = (FileUploadResponse) obj;
            return l.b(this.f2356id, fileUploadResponse.f2356id) && l.b(this.uri, fileUploadResponse.uri);
        }
        return false;
    }

    public final String getId() {
        return this.f2356id;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.f2356id.hashCode() * 31) + this.uri.hashCode();
    }

    public String toString() {
        return "FileUploadResponse(id=" + this.f2356id + ", uri=" + this.uri + ')';
    }
}
