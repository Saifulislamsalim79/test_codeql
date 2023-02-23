package org.org.org.org.org.core.asm;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import org.org.org.org.asm.asm.C14586c;
/* loaded from: classes.dex */
public class ClassReader implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ ClassWriter f32591a;

    public ClassReader(ClassWriter classWriter) {
        this.f32591a = classWriter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        String $r2 = file.getName();
        int $i0 = 0;
        while (true) {
            ClassWriter $r3 = this.f32591a;
            ArrayList $r4 = $r3.f32598c;
            int $i1 = $r4.size();
            if ($i0 >= $i1) {
                return false;
            }
            ClassWriter $r32 = this.f32591a;
            ArrayList $r42 = $r32.f32598c;
            Object $r5 = $r42.get($i0);
            C14586c $r6 = (C14586c) $r5;
            String $r7 = $r6.m1131a();
            boolean $z0 = $r2.endsWith($r7);
            if ($z0) {
                return true;
            }
            $i0++;
        }
    }
}
