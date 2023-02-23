package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.Status;
import p272h.p286c.p287a.p300b.p307d.p310c.BinderC8412b;
import p272h.p286c.p287a.p300b.p307d.p310c.C8413c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.e */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC9211e extends BinderC8412b implements InterfaceC9212f {
    public AbstractBinderC9211e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p310c.BinderC8412b
    /* renamed from: p1 */
    protected final boolean mo15464p1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                C2826b c2826b = (C2826b) C8413c.m16121a(parcel, C2826b.CREATOR);
                C9208b c9208b = (C9208b) C8413c.m16121a(parcel, C9208b.CREATOR);
                break;
            case 4:
                Status status = (Status) C8413c.m16121a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) C8413c.m16121a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C8413c.m16121a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C8413c.m16121a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo15463J((C9218l) C8413c.m16121a(parcel, C9218l.CREATOR));
                break;
            case 9:
                C9214h c9214h = (C9214h) C8413c.m16121a(parcel, C9214h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
