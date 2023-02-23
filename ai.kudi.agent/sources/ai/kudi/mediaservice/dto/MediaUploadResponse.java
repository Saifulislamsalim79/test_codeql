package ai.kudi.mediaservice.dto;

import kotlin.Metadata;
import kotlin.e0.d.l;
/* compiled from: MediaUploadResponse.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/mediaservice/dto/MediaUploadResponse;", "", "id", "", "original", "medium", "thumbnail", "thumbnailx2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMedium", "getOriginal", "getThumbnail", "getThumbnailx2", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaUploadResponse {

    /* renamed from: id */
    private final String f2353id;
    private final String medium;
    private final String original;
    private final String thumbnail;
    private final String thumbnailx2;

    public MediaUploadResponse(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "id");
        l.f(str2, "original");
        l.f(str3, "medium");
        l.f(str4, "thumbnail");
        l.f(str5, "thumbnailx2");
        this.f2353id = str;
        this.original = str2;
        this.medium = str3;
        this.thumbnail = str4;
        this.thumbnailx2 = str5;
    }

    public static /* synthetic */ MediaUploadResponse copy$default(MediaUploadResponse mediaUploadResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaUploadResponse.f2353id;
        }
        if ((i & 2) != 0) {
            str2 = mediaUploadResponse.original;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = mediaUploadResponse.medium;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = mediaUploadResponse.thumbnail;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = mediaUploadResponse.thumbnailx2;
        }
        return mediaUploadResponse.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.f2353id;
    }

    public final String component2() {
        return this.original;
    }

    public final String component3() {
        return this.medium;
    }

    public final String component4() {
        return this.thumbnail;
    }

    public final String component5() {
        return this.thumbnailx2;
    }

    public final MediaUploadResponse copy(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "id");
        l.f(str2, "original");
        l.f(str3, "medium");
        l.f(str4, "thumbnail");
        l.f(str5, "thumbnailx2");
        return new MediaUploadResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaUploadResponse) {
            MediaUploadResponse mediaUploadResponse = (MediaUploadResponse) obj;
            return l.b(this.f2353id, mediaUploadResponse.f2353id) && l.b(this.original, mediaUploadResponse.original) && l.b(this.medium, mediaUploadResponse.medium) && l.b(this.thumbnail, mediaUploadResponse.thumbnail) && l.b(this.thumbnailx2, mediaUploadResponse.thumbnailx2);
        }
        return false;
    }

    public final String getId() {
        return this.f2353id;
    }

    public final String getMedium() {
        return this.medium;
    }

    public final String getOriginal() {
        return this.original;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getThumbnailx2() {
        return this.thumbnailx2;
    }

    public int hashCode() {
        return (((((((this.f2353id.hashCode() * 31) + this.original.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.thumbnail.hashCode()) * 31) + this.thumbnailx2.hashCode();
    }

    public String toString() {
        return "MediaUploadResponse(id=" + this.f2353id + ", original=" + this.original + ", medium=" + this.medium + ", thumbnail=" + this.thumbnail + ", thumbnailx2=" + this.thumbnailx2 + ')';
    }
}
