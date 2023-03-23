package csen1002.tests.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task5.CfgLeftRecElim;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task5TestsBatch0 {

	@Test
	public void testCfgLeftRecursionElimination1() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;Z;J;O;X#b;k;q;t;z#S/SXbX,z;Z/XJXO,XOz,XzJbO,bOzZ,bZq,q;J/JSkZ,Jb,Oz,XkZb,bZSO,zXZJO;O/OZkJk,SJJ,SJtO,qJJJO,tOzXt;X/OkS,SJXkZ,StZO,XJ,XzJq,kXtXZ");
		cfgLeftRecElim.eliminateLeftRecursion();
		System.out.println("S;Z;J;O;X;S';J';O';X'#b;k;q;t;z#S/zS';Z/XJXO,XOz,XzJbO,bOzZ,bZq,q;J/OzJ',XkZbJ',bZSOJ',zXZJOJ';O/zS'JJO',zS'JtOO',qJJJOO',tOzXtO';X/zS'JJO'kSX',zS'JtOO'kSX',qJJJOO'kSX',tOzXtO'kSX',zS'JXkZX',zS'tZOX',kXtXZX';S'/XbXS',e;J'/SkZJ',bJ',e;O'/ZkJkO',e;X'/JX',zJqX',e");
		System.out.println(cfgLeftRecElim.toString());
		//assertEquals("S;Z;J;O;X;S';J';O';X'#b;k;q;t;z#S/zS';Z/XJXO,XOz,XzJbO,bOzZ,bZq,q;J/OzJ',XkZbJ',bZSOJ',zXZJOJ';O/zS'JJO',zS'JtOO',qJJJOO',tOzXtO';X/zS'JJO'kSX',zS'JtOO'kSX',qJJJOO'kSX',tOzXtO'kSX',zS'JXkZX',zS'tZOX',kXtXZX';S'/XbXS',e;J'/SkZJ',bJ',e;O'/ZkJkO',e;X'/JX',zJqX',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination2() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;H;X;V;B#f;x;z#S/SXH,SfH,xVH,zHH;H/SH,SfB,SzXz;X/HSS,fVBf;V/BH,SxV,VzXSH,fH,zXHz,zXzS;B/BHf,BXxVV,HH,XSBH");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;H;X;V;B;S';V';B'#f;x;z#S/xVHS',zHHS';H/xVHS'H,zHHS'H,xVHS'fB,zHHS'fB,xVHS'zXz,zHHS'zXz;X/xVHS'HSS,zHHS'HSS,xVHS'fBSS,zHHS'fBSS,xVHS'zXzSS,zHHS'zXzSS,fVBf;V/BHV',xVHS'xVV',zHHS'xVV',fHV',zXHzV',zXzSV';B/xVHS'HHB',zHHS'HHB',xVHS'fBHB',zHHS'fBHB',xVHS'zXzHB',zHHS'zXzHB',xVHS'HSSSBHB',zHHS'HSSSBHB',xVHS'fBSSSBHB',zHHS'fBSSSBHB',xVHS'zXzSSSBHB',zHHS'zXzSSSBHB',fVBfSBHB';S'/XHS',fHS',e;V'/zXSHV',e;B'/HfB',XxVVB',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination3() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;G;V;D;A#k;v;w#S/SVD,SkDkV,VGwAw;G/VSVD,vGVG,wGGGv;V/AS,AwDwD,vAwD;D/ASS,GwSA,SkS,vVVw;A/AASSD,ASvAV,DvSSS,VvGS,vVVA,w");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;G;V;D;A;S';A'#k;v;w#S/VGwAwS';G/VSVD,vGVG,wGGGv;V/AS,AwDwD,vAwD;D/ASS,ASSVDwSA,AwDwDSVDwSA,vAwDSVDwSA,vGVGwSA,wGGGvwSA,ASGwAwS'kS,AwDwDGwAwS'kS,vAwDGwAwS'kS,vVVw;A/vAwDSVDwSAvSSSA',vGVGwSAvSSSA',wGGGvwSAvSSSA',vAwDGwAwS'kSvSSSA',vVVwvSSSA',vAwDvGSA',vVVAA',wA';S'/VDS',kDkVS',e;A'/ASSDA',SvAVA',SSvSSSA',SSVDwSAvSSSA',wDwDSVDwSAvSSSA',SGwAwS'kSvSSSA',wDwDGwAwS'kSvSSSA',SvGSA',wDwDvGSA',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination4() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;H;V;N;M#c;d;h;s;y#S/HhNV,SVNy,ShH,h;H/cVV,h,yMMcV;V/Hd,MMSM,MS,VHNcH,VsVyV,cVM;N/MHh,SSyH,VM,c,hNVN;M/HHsHy,MVN,NhN");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;H;V;N;M;S';V';M'#c;d;h;s;y#S/HhNVS',hS';H/cVV,h,yMMcV;V/cVVdV',hdV',yMMcVdV',MMSMV',MSV',cVMV';N/MHh,cVVhNVS'SyH,hhNVS'SyH,yMMcVhNVS'SyH,hS'SyH,cVVdV'M,hdV'M,yMMcVdV'M,MMSMV'M,MSV'M,cVMV'M,c,hNVN;M/cVVHsHyM',hHsHyM',yMMcVHsHyM',cVVhNVS'SyHhNM',hhNVS'SyHhNM',yMMcVhNVS'SyHhNM',hS'SyHhNM',cVVdV'MhNM',hdV'MhNM',yMMcVdV'MhNM',cVMV'MhNM',chNM',hNVNhNM';S'/VNyS',hHS',e;V'/HNcHV',sVyVV',e;M'/VNM',HhhNM',MSMV'MhNM',SV'MhNM',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination5() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;U;X;M;W;F;B#g;h;i;t;z#S/SF,StUWF,WtF,tXt;U/FXX,US,UUt,WiX,Xz,iX;X/Xi,gMiW,hFg;M/BSU,UUMSX,gUUB,gX,hM,i;W/BzMz,SiFFi,XFgM,XtMB;F/BgXUW,iXtS;B/BzWM,MM,Xg,Xi,hBi,tBB");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;U;X;M;W;F;B;S';U';X';W';B'#g;h;i;t;z#S/WtFS',tXtS';U/FXXU',WiXU',XzU',iXU';X/gMiWX',hFgX';M/BSU,FXXU'UMSX,WiXU'UMSX,gMiWX'zU'UMSX,hFgX'zU'UMSX,iXU'UMSX,gUUB,gX,hM,i;W/BzMzW',tXtS'iFFiW',gMiWX'FgMW',hFgX'FgMW',gMiWX'tMBW',hFgX'tMBW';F/BgXUW,iXtS;B/iXtSXXU'UMSXMB',tXtS'iFFiW'iXU'UMSXMB',gMiWX'FgMW'iXU'UMSXMB',hFgX'FgMW'iXU'UMSXMB',gMiWX'tMBW'iXU'UMSXMB',hFgX'tMBW'iXU'UMSXMB',gMiWX'zU'UMSXMB',hFgX'zU'UMSXMB',iXU'UMSXMB',gUUBMB',gXMB',hMMB',iMB',gMiWX'gB',hFgX'gB',gMiWX'iB',hFgX'iB',hBiB',tBBB';S'/FS',tUWFS',e;U'/SU',UtU',e;X'/iX',e;W'/tFS'iFFiW',e;B'/zWMB',SUMB',gXUWXXU'UMSXMB',zMzW'iXU'UMSXMB',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination6() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;L;A;F;Y#j;u;y;z#S/AjY,SFAj,SuLS,SzYy,YjA,z;L/LLA,LSA,jA,uLjY,ySY,zS;A/AzYLj,LAF,SALA,zAyYY,zL;F/LA,YFuF,jF,uLzL;Y/AALF,FLLSu,YFuL,jA");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;L;A;F;Y;S';L';A';Y'#j;u;y;z#S/AjYS',YjAS',zS';L/jAL',uLjYL',ySYL',zSL';A/jAL'AFA',uLjYL'AFA',ySYL'AFA',zSL'AFA',YjAS'ALAA',zS'ALAA',zAyYYA',zLA';F/jAL'A,uLjYL'A,ySYL'A,zSL'A,YFuF,jF,uLzL;Y/jAL'AFA'ALFY',uLjYL'AFA'ALFY',ySYL'AFA'ALFY',zSL'AFA'ALFY',zS'ALAA'ALFY',zAyYYA'ALFY',zLA'ALFY',jAL'ALLSuY',uLjYL'ALLSuY',ySYL'ALLSuY',zSL'ALLSuY',jFLLSuY',uLzLLLSuY',jAY';S'/FAjS',uLSS',zYyS',e;L'/LAL',SAL',e;A'/zYLjA',jYS'ALAA',e;Y'/jAS'ALAA'ALFY',FuFLLSuY',FuLY',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination7() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;B;Q;K;N;O#f;k;l;z#S/QlK,f;B/KkBK,z;Q/BN,BzOf,QSfB,Qz,f;K/Kf,KlNNB,SO;N/BSNK,Ql,lOO,zKl;O/BS,lK");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;B;Q;K;N;O;Q';K'#f;k;l;z#S/QlK,f;B/KkBK,z;Q/KkBKNQ',zNQ',KkBKzOfQ',zzOfQ',fQ';K/zNQ'lKOK',zzOfQ'lKOK',fQ'lKOK',fOK';N/zNQ'lKOK'kBKSNK,zzOfQ'lKOK'kBKSNK,fQ'lKOK'kBKSNK,fOK'kBKSNK,zSNK,zNQ'lKOK'kBKNQ'l,zzOfQ'lKOK'kBKNQ'l,fQ'lKOK'kBKNQ'l,fOK'kBKNQ'l,zNQ'l,zNQ'lKOK'kBKzOfQ'l,zzOfQ'lKOK'kBKzOfQ'l,fQ'lKOK'kBKzOfQ'l,fOK'kBKzOfQ'l,zzOfQ'l,fQ'l,lOO,zKl;O/zNQ'lKOK'kBKS,zzOfQ'lKOK'kBKS,fQ'lKOK'kBKS,fOK'kBKS,zS,lK;Q'/SfBQ',zQ',e;K'/fK',lNNBK',kBKNQ'lKOK',kBKzOfQ'lKOK',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination8() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;V;R;F;L#a;g;m;o;p#S/LpSLp,SLFL;V/FFmS,SFgSa,SRFF,VLg,VVSF,mSS;R/LLVpL,SLFF;F/FVo,FoSo,SFRLV,VRFFL,gLVg,gVa;L/FLpLF,gVpVL,pLVoL");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;V;R;F;L;S';V';F';L'#a;g;m;o;p#S/LpSLpS';V/FFmSV',LpSLpS'FgSaV',LpSLpS'RFFV',mSSV';R/LLVpL,LpSLpS'LFF;F/LpSLpS'FRLVF',LpSLpS'FgSaV'RFFLF',LpSLpS'RFFV'RFFLF',mSSV'RFFLF',gLVgF',gVaF';L/mSSV'RFFLF'LpLFL',gLVgF'LpLFL',gVaF'LpLFL',gVpVLL',pLVoLL';S'/LFLS',e;V'/LgV',VSFV',e;F'/VoF',oSoF',FmSV'RFFLF',e;L'/pSLpS'FRLVF'LpLFL',pSLpS'FgSaV'RFFLF'LpLFL',pSLpS'RFFV'RFFLF'LpLFL',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination9() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;P;O;H;N#d;l;y#S/lHlNN,ySHd;P/POyO,SPOHS,dPNPd;O/OHHP,Od,SPHlN,yS,ySHP;H/NdHHO,OdN,OlOyO,dS;N/HdP,NO,Nl,PHO,d,lHPl");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;P;O;H;N;P';O';N'#d;l;y#S/lHlNN,ySHd;P/lHlNNPOHSP',ySHdPOHSP',dPNPdP';O/lHlNNPHlNO',ySHdPHlNO',ySO',ySHPO';H/NdHHO,lHlNNPHlNO'dN,ySHdPHlNO'dN,ySO'dN,ySHPO'dN,lHlNNPHlNO'lOyO,ySHdPHlNO'lOyO,ySO'lOyO,ySHPO'lOyO,dS;N/lHlNNPHlNO'dNdPN',ySHdPHlNO'dNdPN',ySO'dNdPN',ySHPO'dNdPN',lHlNNPHlNO'lOyOdPN',ySHdPHlNO'lOyOdPN',ySO'lOyOdPN',ySHPO'lOyOdPN',dSdPN',lHlNNPOHSP'HON',ySHdPOHSP'HON',dPNPdP'HON',dN',lHPlN';P'/OyOP',e;O'/HHPO',dO',e;N'/dHHOdPN',ON',lN',e", cfgLeftRecElim.toString());
	}

	@Test
	public void testCfgLeftRecursionElimination10() {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;Z;G;P;X;H;R#l;m;p;x#S/mG,pHSP;Z/PpRlP,ZH,Zl,lP,mRRH;G/HX,PXZ,PmZmX,Rm,xP;P/XHpZx,pRH;X/RxZG,ZlGx,ZxH,mX,pSRHS;H/HRXP,HZ,mHP,mPPHR,x;R/GZRX,HGP,lSZS,lZSm,pGxG,pS");
		cfgLeftRecElim.eliminateLeftRecursion();
		assertEquals("S;Z;G;P;X;H;R;Z';X';H';R'#l;m;p;x#S/mG,pHSP;Z/PpRlPZ',lPZ',mRRHZ';G/HX,PXZ,PmZmX,Rm,xP;P/XHpZx,pRH;X/RxZGX',pRHpRlPZ'lGxX',lPZ'lGxX',mRRHZ'lGxX',pRHpRlPZ'xHX',lPZ'xHX',mRRHZ'xHX',mXX',pSRHSX';H/mHPH',mPPHRH',xH';R/mHPH'XZRXR',mPPHRH'XZRXR',xH'XZRXR',pRHpRlPZ'lGxX'HpZxXZZRXR',lPZ'lGxX'HpZxXZZRXR',mRRHZ'lGxX'HpZxXZZRXR',pRHpRlPZ'xHX'HpZxXZZRXR',lPZ'xHX'HpZxXZZRXR',mRRHZ'xHX'HpZxXZZRXR',mXX'HpZxXZZRXR',pSRHSX'HpZxXZZRXR',pRHXZZRXR',pRHpRlPZ'lGxX'HpZxmZmXZRXR',lPZ'lGxX'HpZxmZmXZRXR',mRRHZ'lGxX'HpZxmZmXZRXR',pRHpRlPZ'xHX'HpZxmZmXZRXR',lPZ'xHX'HpZxmZmXZRXR',mRRHZ'xHX'HpZxmZmXZRXR',mXX'HpZxmZmXZRXR',pSRHSX'HpZxmZmXZRXR',pRHmZmXZRXR',xPZRXR',mHPH'GPR',mPPHRH'GPR',xH'GPR',lSZSR',lZSmR',pGxGR',pSR';Z'/HZ',lZ',e;X'/HpZxpRlPZ'lGxX',HpZxpRlPZ'xHX',e;H'/RXPH',ZH',e;R'/xZGX'HpZxXZZRXR',xZGX'HpZxmZmXZRXR',mZRXR',e", cfgLeftRecElim.toString());
	}

}