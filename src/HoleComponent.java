import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Greg on 10/31/2017.
 */
public class HoleComponent extends JComponent
{
	/** Holes are numbered like so:
	 *    0  1  2  3  4  5
	 *    6  7  8  9  10 11  */
	private int id;

	// Width/height of hole
	private int size;

	public HoleComponent(int id, int size) {

		this.id = id;
		this.size = size;

		this.setSize(size, size);
	}

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.drawOval(0, 0, size, size);
		g2d.drawString(Integer.toString(id), size/2, size/2);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(size, size);
	}
}