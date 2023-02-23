package org.org.org.org.asm;

import java.io.File;
import java.io.FileFilter;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* loaded from: classes.dex */
public final class ClassReader implements FileFilter {

    /* renamed from: d */
    public final /* synthetic */ String f32304d;

    public ClassReader(String str) {
        this.f32304d = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean $z0;
        Log_OC.loadImage(file, "pathname");
        String $r2 = file.getName();
        Log_OC.loadImage($r2, "pathname.name");
        String $r3 = this.f32304d;
        $z0 = C13276s.m5443r($r2, $r3, false, 2, null);
        return $z0;
    }
}
