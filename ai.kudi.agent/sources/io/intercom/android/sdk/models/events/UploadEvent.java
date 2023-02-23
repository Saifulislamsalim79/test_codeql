package io.intercom.android.sdk.models.events;

import io.intercom.android.sdk.models.Upload;
/* loaded from: classes3.dex */
public class UploadEvent {
    private final long size;
    private final String tempPartId;
    private final int tempPartPosition;
    private final Upload upload;

    public UploadEvent(Upload upload, long j, int i, String str) {
        this.upload = upload;
        this.size = j;
        this.tempPartPosition = i;
        this.tempPartId = str;
    }

    public long getSize() {
        return this.size;
    }

    public String getTempPartId() {
        return this.tempPartId;
    }

    public int getTempPartPosition() {
        return this.tempPartPosition;
    }

    public Upload getUpload() {
        return this.upload;
    }
}
