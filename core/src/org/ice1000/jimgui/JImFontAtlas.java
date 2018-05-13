package org.ice1000.jimgui;

import org.jetbrains.annotations.NotNull;

/**
 * @author ice1000
 * @since v0.1
 */
public final class JImFontAtlas extends JImGuiFontAtlasGen {
	/** package-private by design */
	JImFontAtlas(long nativeObjectPtr) {
		super(nativeObjectPtr);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param path       path to a ttf file
	 * @param sizePixels font size
	 * @return the font
	 */
	public @NotNull JImFont addFontFromFileTTF(@NotNull String path, float sizePixels) {
		return new JImFont(addFontFromFileTTF(nativeObjectPtr, path, sizePixels));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param compressedFontDataBase85 in-memory base85 compressed font data
	 * @param sizePixels               font size
	 * @return the font
	 */
	public @NotNull JImFont addFontFromMemoryCompressedBase85TTF(@NotNull String compressedFontDataBase85, float sizePixels) {
		return new JImFont(addFontFromMemoryCompressedBase85TTF(nativeObjectPtr, compressedFontDataBase85, sizePixels));
	}
}