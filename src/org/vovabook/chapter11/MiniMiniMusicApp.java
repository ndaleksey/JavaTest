package org.vovabook.chapter11;

import javax.sound.midi.*;
import java.io.IOException;

/**
 * Created by Shishkov A.V. on 25.03.2014.
 */
public class MiniMiniMusicApp
{
	public void play() throws MidiUnavailableException, IOException, InvalidMidiDataException
	{
		Sequencer player = MidiSystem.getSequencer();
		player.open();

		Sequence seq = new Sequence( Sequence.PPQ, 4 );
		Track track = seq.createTrack();

		ShortMessage shortMessageStart = new ShortMessage();
		shortMessageStart.setMessage( 144, 1, 44, 100 );
		MidiEvent noteOn = new MidiEvent( shortMessageStart, 1 );
		track.add( noteOn );

		ShortMessage shortMessage = new ShortMessage();
		shortMessageStart.setMessage( 144, 9, 44, 100 );

		for ( int i = 4; i < 32; i += 4 )
			track.add( new MidiEvent( shortMessage, i ) );

		ShortMessage shortMessageEnd = new ShortMessage();
		shortMessageEnd.setMessage( 128, 1, 44, 100 );
		MidiEvent noteOff = new MidiEvent( shortMessageEnd, 32 );
		track.add( noteOff );

		player.setSequence( seq );
		player.start();
	}

	public static void main( String[] args )
	{
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		try
		{
			mini.play();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}
