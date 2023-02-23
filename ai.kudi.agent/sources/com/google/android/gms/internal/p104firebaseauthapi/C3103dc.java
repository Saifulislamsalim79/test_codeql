package com.google.android.gms.internal.p104firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dc */
/* loaded from: classes2.dex */
public final class C3103dc {

    /* renamed from: a */
    private final ECPrivateKey f8380a;

    public C3103dc(ECPrivateKey eCPrivateKey) {
        this.f8380a = eCPrivateKey;
    }

    /* renamed from: a */
    public final byte[] m31250a(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, int i2) throws GeneralSecurityException {
        ECPoint eCPoint;
        ECPoint eCPoint2;
        ECParameterSpec params;
        ECParameterSpec params2;
        boolean z;
        ECParameterSpec params3 = this.f8380a.getParams();
        EllipticCurve curve = params3.getCurve();
        int m31194a = C3130ec.m31194a(curve);
        int i3 = i2 - 1;
        int i4 = 1;
        try {
            if (i3 == 0) {
                int length = bArr.length;
                if (length == m31194a + m31194a + 1) {
                    if (bArr[0] == 4) {
                        int i5 = m31194a + 1;
                        eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i5)), new BigInteger(1, Arrays.copyOfRange(bArr, i5, length)));
                        C3130ec.m31191d(eCPoint, curve);
                    } else {
                        throw new GeneralSecurityException("invalid point format");
                    }
                } else {
                    throw new GeneralSecurityException("invalid point size");
                }
            } else if (i3 != 2) {
                BigInteger m31193b = C3130ec.m31193b(curve);
                int length2 = bArr.length;
                if (length2 == m31194a + 1) {
                    byte b = bArr[0];
                    if (b == 2) {
                        z = false;
                    } else if (b != 3) {
                        throw new GeneralSecurityException("invalid format");
                    } else {
                        z = true;
                    }
                    BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                    if (bigInteger.signum() != -1 && bigInteger.compareTo(m31193b) < 0) {
                        eCPoint2 = new ECPoint(bigInteger, C3130ec.m31192c(bigInteger, z, curve));
                        ECPublicKey eCPublicKey = (ECPublicKey) C3184gc.f8508i.m31099a("EC").generatePublic(new ECPublicKeySpec(eCPoint2, params3));
                        ECPrivateKey eCPrivateKey = this.f8380a;
                        params = eCPublicKey.getParams();
                        params2 = eCPrivateKey.getParams();
                        if (!params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                            ECPoint w = eCPublicKey.getW();
                            C3130ec.m31191d(w, eCPrivateKey.getParams().getCurve());
                            PublicKey generatePublic = C3184gc.f8508i.m31099a("EC").generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
                            KeyAgreement m31099a = C3184gc.f8506g.m31099a("ECDH");
                            m31099a.init(eCPrivateKey);
                            try {
                                m31099a.doPhase(generatePublic, true);
                                byte[] generateSecret = m31099a.generateSecret();
                                EllipticCurve curve2 = eCPrivateKey.getParams().getCurve();
                                BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                                if (bigInteger2.signum() != -1 && bigInteger2.compareTo(C3130ec.m31193b(curve2)) < 0) {
                                    C3130ec.m31192c(bigInteger2, true, curve2);
                                    byte[] m30128c = C3578vb.m30128c(bArr, generateSecret);
                                    Mac m31099a2 = C3184gc.f8505f.m31099a(str);
                                    if (i <= m31099a2.getMacLength() * 255) {
                                        if (bArr2 != null && bArr2.length != 0) {
                                            m31099a2.init(new SecretKeySpec(bArr2, str));
                                        } else {
                                            m31099a2.init(new SecretKeySpec(new byte[m31099a2.getMacLength()], str));
                                        }
                                        byte[] bArr4 = new byte[i];
                                        m31099a2.init(new SecretKeySpec(m31099a2.doFinal(m30128c), str));
                                        byte[] bArr5 = new byte[0];
                                        int i6 = 0;
                                        while (true) {
                                            m31099a2.update(bArr5);
                                            m31099a2.update((byte[]) null);
                                            m31099a2.update((byte) i4);
                                            bArr5 = m31099a2.doFinal();
                                            int length3 = bArr5.length;
                                            int i7 = i6 + length3;
                                            if (i7 < i) {
                                                System.arraycopy(bArr5, 0, bArr4, i6, length3);
                                                i4++;
                                                i6 = i7;
                                            } else {
                                                System.arraycopy(bArr5, 0, bArr4, i6, i - i6);
                                                return bArr4;
                                            }
                                        }
                                    } else {
                                        throw new GeneralSecurityException("size too large");
                                    }
                                } else {
                                    throw new GeneralSecurityException("shared secret is out of range");
                                }
                            } catch (IllegalStateException e) {
                                throw new GeneralSecurityException(e.toString());
                            }
                        } else {
                            throw new GeneralSecurityException("invalid public key spec");
                        }
                    } else {
                        throw new GeneralSecurityException("x is out of range");
                    }
                } else {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
            } else {
                int length4 = bArr.length;
                if (length4 == m31194a + m31194a) {
                    eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, m31194a)), new BigInteger(1, Arrays.copyOfRange(bArr, m31194a, length4)));
                    C3130ec.m31191d(eCPoint, curve);
                } else {
                    throw new GeneralSecurityException("invalid point size");
                }
            }
            params = eCPublicKey.getParams();
            params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve())) {
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
        eCPoint2 = eCPoint;
        ECPublicKey eCPublicKey2 = (ECPublicKey) C3184gc.f8508i.m31099a("EC").generatePublic(new ECPublicKeySpec(eCPoint2, params3));
        ECPrivateKey eCPrivateKey2 = this.f8380a;
    }
}
