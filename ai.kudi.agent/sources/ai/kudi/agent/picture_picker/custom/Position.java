package ai.kudi.agent.picture_picker.custom;

import android.util.Size;
import java.util.Comparator;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Position implements Comparator {
    public static final /* synthetic */ Position AUTO;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Position $r0 = new Position();
        AUTO = $r0;
    }

    private /* synthetic */ Position() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size $r3 = (Size) obj;
        Size $r4 = (Size) obj2;
        int $i0 = ApiLevel21AndAboveCameraManager.m40009compareSizesByArea$lambda0($r3, $r4);
        return $i0;
    }
}
