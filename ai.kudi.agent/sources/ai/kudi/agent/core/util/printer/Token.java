package ai.kudi.agent.core.util.printer;

import android.content.DialogInterface;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements DialogInterface.OnClickListener {
    public static final /* synthetic */ Token FUNCTION;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        FUNCTION = $r0;
    }

    private /* synthetic */ Token() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
