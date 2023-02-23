package ai.kudi.mediaservice.marketplaceCollection.response;

import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: UploadResponse.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/response/UploadResponse;", "", "fileUploadResponse", "Lai/kudi/mediaservice/marketplaceCollection/response/FileUploadResponse;", "errorResponseMessage", "", "(Lai/kudi/mediaservice/marketplaceCollection/response/FileUploadResponse;Ljava/lang/String;)V", "getErrorResponseMessage", "()Ljava/lang/String;", "getFileUploadResponse", "()Lai/kudi/mediaservice/marketplaceCollection/response/FileUploadResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadResponse {
    private final String errorResponseMessage;
    private final FileUploadResponse fileUploadResponse;

    public UploadResponse() {
        this(null, null, 3, null);
    }

    public UploadResponse(FileUploadResponse fileUploadResponse, String str) {
        this.fileUploadResponse = fileUploadResponse;
        this.errorResponseMessage = str;
    }

    public static /* synthetic */ UploadResponse copy$default(UploadResponse uploadResponse, FileUploadResponse fileUploadResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fileUploadResponse = uploadResponse.fileUploadResponse;
        }
        if ((i & 2) != 0) {
            str = uploadResponse.errorResponseMessage;
        }
        return uploadResponse.copy(fileUploadResponse, str);
    }

    public final FileUploadResponse component1() {
        return this.fileUploadResponse;
    }

    public final String component2() {
        return this.errorResponseMessage;
    }

    public final UploadResponse copy(FileUploadResponse fileUploadResponse, String str) {
        return new UploadResponse(fileUploadResponse, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadResponse) {
            UploadResponse uploadResponse = (UploadResponse) obj;
            return l.b(this.fileUploadResponse, uploadResponse.fileUploadResponse) && l.b(this.errorResponseMessage, uploadResponse.errorResponseMessage);
        }
        return false;
    }

    public final String getErrorResponseMessage() {
        return this.errorResponseMessage;
    }

    public final FileUploadResponse getFileUploadResponse() {
        return this.fileUploadResponse;
    }

    public int hashCode() {
        FileUploadResponse fileUploadResponse = this.fileUploadResponse;
        int hashCode = (fileUploadResponse == null ? 0 : fileUploadResponse.hashCode()) * 31;
        String str = this.errorResponseMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UploadResponse(fileUploadResponse=" + this.fileUploadResponse + ", errorResponseMessage=" + ((Object) this.errorResponseMessage) + ')';
    }

    public /* synthetic */ UploadResponse(FileUploadResponse fileUploadResponse, String str, int i, g gVar) {
        this((i & 1) != 0 ? null : fileUploadResponse, (i & 2) != 0 ? null : str);
    }
}
