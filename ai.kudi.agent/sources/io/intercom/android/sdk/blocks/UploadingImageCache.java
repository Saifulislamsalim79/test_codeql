package io.intercom.android.sdk.blocks;

import android.net.Uri;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.models.Upload;
import java.util.Map;
/* loaded from: classes.dex */
public class UploadingImageCache {
    private final Map<String, String> localImagePaths;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadingImageCache() {
        /*
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.UploadingImageCache.<init>():void");
    }

    UploadingImageCache(Map map) {
        this.localImagePaths = map;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getLocalImagePathForRemoteUrl(String str) {
        Map $r1 = this.localImagePaths;
        Object $r2 = $r1.get(str);
        String $r3 = (String) $r2;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void url(Upload upload, GalleryImage galleryImage) {
        String $r3 = upload.getUploadDestination();
        Uri $r4 = Uri.parse($r3);
        Uri.Builder $r5 = $r4.buildUpon();
        String $r32 = upload.getKey();
        Uri $r42 = $r5.path($r32).build();
        Map $r6 = this.localImagePaths;
        String $r33 = $r42.toString();
        String $r7 = galleryImage.getPath();
        $r6.put($r33, $r7);
    }
}
