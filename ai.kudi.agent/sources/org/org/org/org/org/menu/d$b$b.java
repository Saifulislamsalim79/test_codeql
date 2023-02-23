package org.org.org.org.org.menu;

import java.io.File;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* loaded from: classes.dex */
public final class d$b$b extends AbstractC11802m implements InterfaceC11767l<File, Boolean> {
    public static final d$b$b ABSOLUTE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        d$b$b $r0 = new d$b$b();
        ABSOLUTE = $r0;
    }

    public d$b$b() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ Boolean invoke(File file) {
        File $r2 = file;
        boolean $z0 = update($r2);
        Boolean $r3 = Boolean.valueOf($z0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean update(File file) {
        boolean $z0;
        Log_OC.getArray(file, "it");
        String $r2 = file.getName();
        Log_OC.loadImage($r2, "it.name");
        $z0 = C13276s.m5444q($r2, ".jpg", true);
        return !$z0;
    }
}
