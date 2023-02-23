package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public abstract class IExtensionHost$Stub extends IDeathCallback_0_8$Stub implements LifecycleHandler {
    public IExtensionHost$Stub() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LifecycleHandler asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface $r0 = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        boolean $z0 = $r0 instanceof LifecycleHandler;
        if ($z0) {
            LifecycleHandler $r2 = (LifecycleHandler) $r0;
            return $r2;
        }
        C3747d1 r4 = new C3747d1(iBinder);
        LifecycleHandler $r22 = (LifecycleHandler) r4;
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.IDeathCallback_0_8$Stub
    protected final boolean setDisplayMode(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Object $r3;
        Object $r32 = null;
        switch (i) {
            case 1:
                InterfaceC2987a $r11 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                Parcelable.Creator $r4 = C3919o1.CREATOR;
                Parcelable $r5 = C3948q0.m29090a(parcel, $r4);
                C3919o1 $r15 = (C3919o1) $r5;
                long $l2 = parcel.readLong();
                initialize($r11, $r15, $l2);
                break;
            case 2:
                String $r10 = parcel.readString();
                String $r14 = parcel.readString();
                Parcelable.Creator $r42 = Bundle.CREATOR;
                Parcelable $r52 = C3948q0.m29090a(parcel, $r42);
                Bundle $r6 = (Bundle) $r52;
                boolean $z0 = C3948q0.m29085f(parcel);
                boolean $z1 = C3948q0.m29085f(parcel);
                long $l22 = parcel.readLong();
                logEvent($r10, $r14, $r6, $z0, $z1, $l22);
                break;
            case 3:
                String $r102 = parcel.readString();
                String $r142 = parcel.readString();
                Parcelable.Creator $r43 = Bundle.CREATOR;
                Parcelable $r53 = C3948q0.m29090a(parcel, $r43);
                Bundle $r62 = (Bundle) $r53;
                IBinder $r7 = parcel.readStrongBinder();
                if ($r7 == null) {
                    $r3 = null;
                } else {
                    Object $r8 = $r7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z02 = $r8 instanceof InterfaceC3824i1;
                    if ($z02) {
                        $r3 = (InterfaceC3824i1) $r8;
                    } else {
                        $r3 = r16;
                        Object r16 = new C3792g1($r7);
                    }
                }
                long $l23 = parcel.readLong();
                InterfaceC3824i1 r19 = (InterfaceC3824i1) $r3;
                logEventAndBundle($r102, $r142, $r62, r19, $l23);
                break;
            case 4:
                String $r103 = parcel.readString();
                String $r143 = parcel.readString();
                InterfaceC2987a $r112 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                boolean $z03 = C3948q0.m29085f(parcel);
                long $l24 = parcel.readLong();
                setUserProperty($r103, $r143, $r112, $z03, $l24);
                break;
            case 5:
                String $r104 = parcel.readString();
                String $r144 = parcel.readString();
                boolean $z04 = C3948q0.m29085f(parcel);
                IBinder $r72 = parcel.readStrongBinder();
                if ($r72 != null) {
                    IInterface $r82 = $r72.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z12 = $r82 instanceof InterfaceC3824i1;
                    if ($z12) {
                        $r32 = (InterfaceC3824i1) $r82;
                    } else {
                        $r32 = r16;
                        Object r162 = new C3792g1($r72);
                    }
                }
                InterfaceC3824i1 r192 = (InterfaceC3824i1) $r32;
                getUserProperties($r104, $r144, $z04, r192);
                break;
            case 6:
                String $r105 = parcel.readString();
                IBinder $r73 = parcel.readStrongBinder();
                if ($r73 != null) {
                    IInterface $r83 = $r73.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z05 = $r83 instanceof InterfaceC3824i1;
                    if ($z05) {
                        $r32 = (InterfaceC3824i1) $r83;
                    } else {
                        $r32 = r16;
                        Object r163 = new C3792g1($r73);
                    }
                }
                InterfaceC3824i1 r193 = (InterfaceC3824i1) $r32;
                getMaxUserProperties($r105, r193);
                break;
            case 7:
                String $r106 = parcel.readString();
                long $l25 = parcel.readLong();
                setUserId($r106, $l25);
                break;
            case 8:
                Parcelable.Creator $r44 = Bundle.CREATOR;
                Parcelable $r54 = C3948q0.m29090a(parcel, $r44);
                Bundle $r63 = (Bundle) $r54;
                long $l26 = parcel.readLong();
                setConditionalUserProperty($r63, $l26);
                break;
            case 9:
                String $r107 = parcel.readString();
                String $r145 = parcel.readString();
                Parcelable.Creator $r45 = Bundle.CREATOR;
                Parcelable $r55 = C3948q0.m29090a(parcel, $r45);
                Bundle $r64 = (Bundle) $r55;
                clearConditionalUserProperty($r107, $r145, $r64);
                break;
            case 10:
                String $r108 = parcel.readString();
                String $r146 = parcel.readString();
                IBinder $r74 = parcel.readStrongBinder();
                if ($r74 != null) {
                    IInterface $r84 = $r74.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z06 = $r84 instanceof InterfaceC3824i1;
                    if ($z06) {
                        $r32 = (InterfaceC3824i1) $r84;
                    } else {
                        $r32 = r16;
                        Object r164 = new C3792g1($r74);
                    }
                }
                InterfaceC3824i1 r194 = (InterfaceC3824i1) $r32;
                getConditionalUserProperties($r108, $r146, r194);
                break;
            case 11:
                boolean $z07 = C3948q0.m29085f(parcel);
                long $l27 = parcel.readLong();
                setMeasurementEnabled($z07, $l27);
                break;
            case 12:
                long $l28 = parcel.readLong();
                resetAnalyticsData($l28);
                break;
            case 13:
                long $l29 = parcel.readLong();
                setMinimumSessionDuration($l29);
                break;
            case 14:
                long $l210 = parcel.readLong();
                setSessionTimeoutDuration($l210);
                break;
            case 15:
                InterfaceC2987a $r113 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                String $r109 = parcel.readString();
                String $r147 = parcel.readString();
                long $l211 = parcel.readLong();
                setCurrentScreen($r113, $r109, $r147, $l211);
                break;
            case 16:
                IBinder $r75 = parcel.readStrongBinder();
                if ($r75 != null) {
                    IInterface $r85 = $r75.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z08 = $r85 instanceof InterfaceC3824i1;
                    if ($z08) {
                        $r32 = (InterfaceC3824i1) $r85;
                    } else {
                        $r32 = r16;
                        Object r165 = new C3792g1($r75);
                    }
                }
                InterfaceC3824i1 r195 = (InterfaceC3824i1) $r32;
                getCurrentScreenName(r195);
                break;
            case 17:
                IBinder $r76 = parcel.readStrongBinder();
                if ($r76 != null) {
                    IInterface $r86 = $r76.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z09 = $r86 instanceof InterfaceC3824i1;
                    if ($z09) {
                        $r32 = (InterfaceC3824i1) $r86;
                    } else {
                        $r32 = r16;
                        Object r166 = new C3792g1($r76);
                    }
                }
                InterfaceC3824i1 r196 = (InterfaceC3824i1) $r32;
                getCurrentScreenClass(r196);
                break;
            case 18:
                IBinder $r77 = parcel.readStrongBinder();
                if ($r77 != null) {
                    IInterface $r87 = $r77.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    boolean $z010 = $r87 instanceof InterfaceC3903n1;
                    if ($z010) {
                        $r32 = (InterfaceC3903n1) $r87;
                    } else {
                        $r32 = r18;
                        Object r18 = new C3887m1($r77);
                    }
                }
                InterfaceC3903n1 r21 = (InterfaceC3903n1) $r32;
                setInstanceIdProvider(r21);
                break;
            case 19:
                IBinder $r78 = parcel.readStrongBinder();
                if ($r78 != null) {
                    IInterface $r88 = $r78.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z011 = $r88 instanceof InterfaceC3824i1;
                    if ($z011) {
                        $r32 = (InterfaceC3824i1) $r88;
                    } else {
                        $r32 = r16;
                        Object r167 = new C3792g1($r78);
                    }
                }
                InterfaceC3824i1 r197 = (InterfaceC3824i1) $r32;
                getCachedAppInstanceId(r197);
                break;
            case 20:
                IBinder $r79 = parcel.readStrongBinder();
                if ($r79 != null) {
                    IInterface $r89 = $r79.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z012 = $r89 instanceof InterfaceC3824i1;
                    if ($z012) {
                        $r32 = (InterfaceC3824i1) $r89;
                    } else {
                        $r32 = r16;
                        Object r168 = new C3792g1($r79);
                    }
                }
                InterfaceC3824i1 r198 = (InterfaceC3824i1) $r32;
                getAppInstanceId(r198);
                break;
            case 21:
                IBinder $r710 = parcel.readStrongBinder();
                if ($r710 != null) {
                    IInterface $r810 = $r710.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z013 = $r810 instanceof InterfaceC3824i1;
                    if ($z013) {
                        $r32 = (InterfaceC3824i1) $r810;
                    } else {
                        $r32 = r16;
                        Object r169 = new C3792g1($r710);
                    }
                }
                InterfaceC3824i1 r199 = (InterfaceC3824i1) $r32;
                getGmpAppId(r199);
                break;
            case 22:
                IBinder $r711 = parcel.readStrongBinder();
                if ($r711 != null) {
                    IInterface $r811 = $r711.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z014 = $r811 instanceof InterfaceC3824i1;
                    if ($z014) {
                        $r32 = (InterfaceC3824i1) $r811;
                    } else {
                        $r32 = r16;
                        Object r1610 = new C3792g1($r711);
                    }
                }
                InterfaceC3824i1 r1910 = (InterfaceC3824i1) $r32;
                generateEventId(r1910);
                break;
            case 23:
                String $r1010 = parcel.readString();
                long $l212 = parcel.readLong();
                beginAdUnitExposure($r1010, $l212);
                break;
            case 24:
                String $r1011 = parcel.readString();
                long $l213 = parcel.readLong();
                endAdUnitExposure($r1011, $l213);
                break;
            case 25:
                InterfaceC2987a $r114 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                long $l214 = parcel.readLong();
                onActivityStarted($r114, $l214);
                break;
            case 26:
                InterfaceC2987a $r115 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                long $l215 = parcel.readLong();
                onActivityStopped($r115, $l215);
                break;
            case 27:
                InterfaceC2987a $r116 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                Parcelable.Creator $r46 = Bundle.CREATOR;
                Parcelable $r56 = C3948q0.m29090a(parcel, $r46);
                Bundle $r65 = (Bundle) $r56;
                long $l216 = parcel.readLong();
                onActivityCreated($r116, $r65, $l216);
                break;
            case 28:
                InterfaceC2987a $r117 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                long $l217 = parcel.readLong();
                onActivityDestroyed($r117, $l217);
                break;
            case 29:
                InterfaceC2987a $r118 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                long $l218 = parcel.readLong();
                onActivityPaused($r118, $l218);
                break;
            case 30:
                InterfaceC2987a $r119 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                long $l219 = parcel.readLong();
                onActivityResumed($r119, $l219);
                break;
            case 31:
                InterfaceC2987a $r1110 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                IBinder $r712 = parcel.readStrongBinder();
                if ($r712 != null) {
                    IInterface $r812 = $r712.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z015 = $r812 instanceof InterfaceC3824i1;
                    if ($z015) {
                        $r32 = (InterfaceC3824i1) $r812;
                    } else {
                        $r32 = r16;
                        Object r1611 = new C3792g1($r712);
                    }
                }
                long $l220 = parcel.readLong();
                InterfaceC3824i1 r1911 = (InterfaceC3824i1) $r32;
                onActivitySaveInstanceState($r1110, r1911, $l220);
                break;
            case 32:
                Parcelable.Creator $r47 = Bundle.CREATOR;
                Parcelable $r57 = C3948q0.m29090a(parcel, $r47);
                Bundle $r66 = (Bundle) $r57;
                IBinder $r713 = parcel.readStrongBinder();
                if ($r713 != null) {
                    IInterface $r813 = $r713.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z016 = $r813 instanceof InterfaceC3824i1;
                    if ($z016) {
                        $r32 = (InterfaceC3824i1) $r813;
                    } else {
                        $r32 = r16;
                        Object r1612 = new C3792g1($r713);
                    }
                }
                long $l221 = parcel.readLong();
                InterfaceC3824i1 r1912 = (InterfaceC3824i1) $r32;
                performAction($r66, r1912, $l221);
                break;
            case 33:
                int $i0 = parcel.readInt();
                String $r1012 = parcel.readString();
                InterfaceC2987a $r1111 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                InterfaceC2987a $r12 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                InterfaceC2987a $r13 = InterfaceC2987a.AbstractBinderC2988a.m31496n(parcel.readStrongBinder());
                logHealthData($i0, $r1012, $r1111, $r12, $r13);
                break;
            case 34:
                IBinder $r714 = parcel.readStrongBinder();
                if ($r714 != null) {
                    IInterface $r814 = $r714.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    boolean $z017 = $r814 instanceof InterfaceC3872l1;
                    if ($z017) {
                        $r32 = (InterfaceC3872l1) $r814;
                    } else {
                        $r32 = r17;
                        Object r17 = new C3840j1($r714);
                    }
                }
                InterfaceC3872l1 r20 = (InterfaceC3872l1) $r32;
                setEventInterceptor(r20);
                break;
            case 35:
                IBinder $r715 = parcel.readStrongBinder();
                if ($r715 != null) {
                    IInterface $r815 = $r715.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    boolean $z018 = $r815 instanceof InterfaceC3872l1;
                    if ($z018) {
                        $r32 = (InterfaceC3872l1) $r815;
                    } else {
                        $r32 = r17;
                        Object r172 = new C3840j1($r715);
                    }
                }
                InterfaceC3872l1 r202 = (InterfaceC3872l1) $r32;
                registerOnMeasurementEventListener(r202);
                break;
            case 36:
                IBinder $r716 = parcel.readStrongBinder();
                if ($r716 != null) {
                    IInterface $r816 = $r716.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    boolean $z019 = $r816 instanceof InterfaceC3872l1;
                    if ($z019) {
                        $r32 = (InterfaceC3872l1) $r816;
                    } else {
                        $r32 = r17;
                        Object r173 = new C3840j1($r716);
                    }
                }
                InterfaceC3872l1 r203 = (InterfaceC3872l1) $r32;
                unregisterOnMeasurementEventListener(r203);
                break;
            case 37:
                HashMap $r9 = C3948q0.m29089b(parcel);
                initForTests($r9);
                break;
            case 38:
                IBinder $r717 = parcel.readStrongBinder();
                if ($r717 != null) {
                    IInterface $r817 = $r717.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z020 = $r817 instanceof InterfaceC3824i1;
                    if ($z020) {
                        $r32 = (InterfaceC3824i1) $r817;
                    } else {
                        $r32 = r16;
                        Object r1613 = new C3792g1($r717);
                    }
                }
                int $i02 = parcel.readInt();
                InterfaceC3824i1 r1913 = (InterfaceC3824i1) $r32;
                getTestFlag(r1913, $i02);
                break;
            case 39:
                boolean $z021 = C3948q0.m29085f(parcel);
                setDataCollectionEnabled($z021);
                break;
            case 40:
                IBinder $r718 = parcel.readStrongBinder();
                if ($r718 != null) {
                    IInterface $r818 = $r718.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    boolean $z022 = $r818 instanceof InterfaceC3824i1;
                    if ($z022) {
                        $r32 = (InterfaceC3824i1) $r818;
                    } else {
                        $r32 = r16;
                        Object r1614 = new C3792g1($r718);
                    }
                }
                InterfaceC3824i1 r1914 = (InterfaceC3824i1) $r32;
                isDataCollectionEnabled(r1914);
                break;
            case 41:
            default:
                return false;
            case 42:
                Parcelable.Creator $r48 = Bundle.CREATOR;
                Parcelable $r58 = C3948q0.m29090a(parcel, $r48);
                Bundle $r67 = (Bundle) $r58;
                setDefaultEventParameters($r67);
                break;
            case 43:
                long $l222 = parcel.readLong();
                clearMeasurementEnabled($l222);
                break;
            case 44:
                Parcelable.Creator $r49 = Bundle.CREATOR;
                Parcelable $r59 = C3948q0.m29090a(parcel, $r49);
                Bundle $r68 = (Bundle) $r59;
                long $l223 = parcel.readLong();
                setConsent($r68, $l223);
                break;
            case 45:
                Parcelable.Creator $r410 = Bundle.CREATOR;
                Parcelable $r510 = C3948q0.m29090a(parcel, $r410);
                Bundle $r69 = (Bundle) $r510;
                long $l224 = parcel.readLong();
                setConsentThirdParty($r69, $l224);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
