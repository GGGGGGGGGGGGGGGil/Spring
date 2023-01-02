package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV implements TV {
	
	@Autowired
	private Speaker spk;
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn...");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff...");
	}
	@Override
	public void ChUp() {
		System.out.println("SamsungTV ChUp...");
	}
	@Override
	public void ChDown() {
		System.out.println("SamsungTV ChDown...");
	}
	@Override
	public void SoundUp() {
		spk.soundUp();
	}
	@Override
	public void SoundDown() {
		spk.soundDown();
	}
}
