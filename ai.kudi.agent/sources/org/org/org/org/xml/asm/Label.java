package org.org.org.org.xml.asm;

import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.xml.FastMap;
import org.org.org.org.xml.core.Segment;
/* loaded from: classes.dex */
public abstract class Label {
    public final FastMap backgroundColor;

    public Label(FastMap fastMap) {
        Log_OC.getArray(fastMap, "sessionRecordIdStorage");
        this.backgroundColor = fastMap;
    }

    /* renamed from: a */
    public abstract void mo468a(Segment segment);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FastMap setColor() {
        FastMap r1 = this.backgroundColor;
        return r1;
    }
}
